document.addEventListener('DOMContentLoaded', () => {
    getData();
    const searcbutton = document.getElementById('search_button');
    searcbutton.addEventListener('click', () => {
        enviarRequisicao();
    })
}
);

// Função para buscar os dados do backend
function getData(url) {
    const dadosDiv = document.getElementById('panel');

    fetch(url)
        .then(response => response.json())
        .then(data => {
            dadosDiv.innerHTML = ''; // Limpa o painel antes de adicionar novos cards

            data.forEach(item => {
                const card = document.createElement('div');
                card.classList.add('card');

                const cardHeader = document.createElement('div');
                cardHeader.classList.add('card_header');

                const title = document.createElement('h4');
                title.textContent = item.name;

                cardHeader.appendChild(title);

                const deleteButton = document.createElement('button');
                deleteButton.innerHTML = '&#x2715;'; // Ou o ícone de lixo
                deleteButton.classList.add('delete-button');
                deleteButton.addEventListener('click', () => {
                    deleteCard(item.id, card); // Chame a função para excluir o card pelo ID
                });

                
                const editButton = document.createElement('button');
                editButton.innerHTML = 'Editar';
                editButton.classList.add('edit-button');
                addUpdateEvent(editButton, item.id)
                editButton.setAttribute('data-id', item.id); // Definir o ID da tarefa como um atributo do botão de edição
                
                cardHeader.appendChild(editButton);
                cardHeader.appendChild(deleteButton);
                

                const cardContent = document.createElement('div');
                cardContent.classList.add('card_content');
                cardContent.innerHTML = `
                    <p>${item.description}</p>
                    <p>Prazo: ${item.dueDate ? item.dueDate : 'Não especificado'}</p>
                    <p>Concluída: ${item.completed ? 'Sim' : 'Não'}</p>
                `;

                card.appendChild(cardHeader);
                card.appendChild(cardContent);

                dadosDiv.appendChild(card);
            });
        })
        .catch(error => { //crie uma função para atualizar o objeto com base no id. deve-se abrir o mesmo formulário para criação. a função deve 
            console.error('Erro na requisição:', error);
            // Trate possíveis erros
        });
}


// adiciona evento para atualizar tarefa
function addUpdateEvent(editButton, id) {
    editButton.addEventListener('click', () => {
        const modal = document.getElementById('updateModal');
        modal.style.display = 'block';

        const span = document.getElementsByClassName('close')[1];
        span.addEventListener('click', () => { closeModal('updateModal') });

        updateForm(id);

        const form = document.getElementById('taskForm');
        // remove todos os eventos listeners anteriores
        form.replaceWith(form.cloneNode(true));
        // adiciona o evento ao novo form
        form.addEventListener('submit', event => {
            event.preventDefault();
            const formData = new FormData(form);
            updateTask(id, formData);
        });
    });
}


function enviarRequisicao() {
    const input = document.getElementById('search'); // substitua 'inputId' pelo ID do seu input
    const inputValue = input.value;

    fetch(`http://localhost:8080/task/name/${encodeURIComponent(inputValue)}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log('Dados recebidos:', data);
            getData(`http://localhost:8080/task/name/${encodeURIComponent(inputValue)}`)
        })
        .catch(error => {
            console.error('Erro na requisição:', error);
            // Trate possíveis erros
        });
}

// evento para abrir o formulário de edição
function createTask(formData) {
    const taskData = {
        name: formData.get('name'),
        description: formData.get('description'),
        dueDate: formData.get('dueDate'),
        completed: formData.get('completed') === 'on'
    };

    fetch('http://localhost:8080/task', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(taskData)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao enviar os dados para o servidor.');
            }
            return response.json();
        })
        .then(data => {
            console.log('Nova tarefa criada:', data);
            closeModal(myModal);
            resetForm();
        })
        .catch(error => {
            console.error('Erro:', error);
        });
}

function openModal(modalId) {
    const modal = document.getElementById(modalId);
    modal.style.display = 'block';

    if (modalId === 'myModal') {
        const spam = document.getElementsByClassName('close')[0];
    } else {
        const spam = document.getElementsByClassName('edit-close')[0];
    }
    spam.addEventListener('click', () => { closeModal(modalId) })
}

function closeModal(modalId) {
    const modal = document.getElementById(modalId);
    modal.style.display = 'none';
}

function resetForm() {
    const form = document.getElementById('taskForm');
    form.reset();
}

function deleteCard(cardId, cardElement) {
    fetch(`http://localhost:8080/task/${cardId}`, {
        method: 'DELETE',
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao excluir o card.');
            }
            console.log('Card excluído com sucesso!');
            cardElement.remove(); // Remove o card da interface após a exclusão
        })
        .catch(error => {
            console.error('Erro ao excluir o card:', error);
            // Trate possíveis erros
        });
}

// abre formulário com os dados preenchidos da tarefa selecionada
async function updateForm(id) {
    try {
        // Buscar os dados da tarefa pelo ID
        if (typeof id === 'number') {
            const response = await fetch(`http://localhost:8080/task/id/${id}`);
            // transformar os dados em JSON
            const dbResponse = await response.json();

            // referenciar o modal
            const form = document.getElementById('updateTaskForm');
            // preencher os campos do formulário com os dados da tarefa
            form.updateName.value = dbResponse.name;
            form.updateDescription.value = dbResponse.description;
            form.updateDueDate.value = dbResponse.dueDate;
            form.updateCompleted.checked = dbResponse.completed;

            
            form.addEventListener('submit', function(event) {
                event.preventDefault();

                const taskData = {
                    name: form.updateName.value,
                    description: form.updateDescription.value,
                    dueDate: form.updateDueDate.value,
                    completed: form.updateCompleted.checked
                }
                updateTask(id,taskData);
            });
        } else {
            console.error('ID is not a nmber: ', id);
        }
    } catch (error) {
        console.error('Erro ao buscar os dados da tarefa:', error);
    };
}


// Função para atualizar tarefa
async function updateTask(id, taskData) {
    const modal = document.getElementById('updateModal');
    const form = document.getElementById('updateTaskForm');

    fetch(`http://localhost:8080/task/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(taskData)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao enviar os dados para o servidor.');
            }
            return response.json();
        })
        .then(data => {
            console.log('Tarefa atualizada:', data);
            modal.style.display = 'none';
            form.reset();
        })
        .catch(error => {
            console.error('Erro:', error);
        });
}

// adiciona evento para abrir modal para criar nova tarefa
document.addEventListener('DOMContentLoaded', () => {
    const btn = document.getElementById('insert_task');
    const span = document.getElementsByClassName('close')[0];

    btn.addEventListener('click', () => { openModal('myModal') });

    span.addEventListener('click', () => { closeModal('myModal') });

    // Fechar o modal quando o usuário clicar fora da área do modal
    window.addEventListener('click', event => {
        const modal = document.getElementById('myModal');
        const updt_modal = document.getElementById('updateModal');
        if (event.target === modal || event.target === updt_modal) {
            closeModal('myModal');
            closeModal('updateModal');
        }
    });

    const form = document.getElementById('taskForm');

    form.addEventListener('submit', event => {
        event.preventDefault();
        const formData = new FormData(form);
        createTask(formData);
        closeModal('myModal');
        location.reload();
    });
});

getData('http://localhost:8080/task');