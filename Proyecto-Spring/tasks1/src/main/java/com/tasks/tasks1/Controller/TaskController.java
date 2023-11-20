package com.tasks.tasks1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasks.tasks1.Entity.Task;
import com.tasks.tasks1.Service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<?> addTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.save(task));
    }

    @GetMapping
    public ResponseEntity<?> listTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAll());
    }

    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.updateTask(task));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.deleteTask(task));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getById(id));
    }
}
