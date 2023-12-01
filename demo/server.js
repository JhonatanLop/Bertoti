const express = require('express');
const app = express();
const path = require('path');

// Defina o diretório onde seus arquivos estáticos (HTML, CSS, JS) estão localizados
const publicPath = path.join(__dirname, './src/main/resources/templates/resources');

// Servir os arquivos estáticos
app.use(express.static(publicPath));

// Configurar as rotas do seu backend
app.get('/task', (req, res) => {
    // Lógica para lidar com as requisições do seu backend
    // Por exemplo: res.send('Resposta do backend');
});

// Iniciar o servidor na porta desejada (por exemplo, porta 3000)
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
