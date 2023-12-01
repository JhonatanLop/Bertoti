    package api.demo.controller;

    import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.demo.classes.Task;
import api.demo.repository.TaskRespository;

    @RestController
    @RequestMapping("/task")
    public class TaskController {

        @Autowired private final TaskRespository taskRespository;

        public TaskController(TaskRespository taskRespository){this.taskRespository = taskRespository;}

        @GetMapping
        public List<Task> getAllTask() {
            return taskRespository.findAll();
        }

        @GetMapping("/id/{id}")
        public Task getTaskById(@PathVariable Long id){
            return taskRespository.findById(id).orElseThrow();
        }

        @GetMapping("/name/{name}")
        public List<Task> getTaskByName(@PathVariable String name){
            return taskRespository.findByName(name);
        }

        @PostMapping
        public Task createTask(@RequestBody Task task){
            return taskRespository.save(task);
        }

        @PutMapping("/{id}")
        public Task updateTask(@PathVariable Long id, @RequestBody Task newTask){
            Task task = taskRespository.findById(id).orElseThrow();
            if (newTask.getName() != null) {task.setName(newTask.getName());};
            if (newTask.getDescription() != null) {task.setDescription(newTask.getDescription());};
            // if (newTask.isCompleted() != null){task.setCompleted(newTask.isCompleted())};
            if (newTask.getDueDate() != null){task.setDueDate(newTask.getDueDate());};
            return taskRespository.save(task);
        }

        @DeleteMapping("/{id}")
        public void deleteTask(@PathVariable Long id){
            taskRespository.deleteById(id);
        }
    }
