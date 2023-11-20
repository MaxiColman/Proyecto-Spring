package com.tasks.tasks1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasks.tasks1.Entity.Task;
import com.tasks.tasks1.Repository.TaskRepository;

import jakarta.transaction.Transactional;

@Service
public class TaskServiceImpl implements TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    @Override
    @Transactional
    public Task save(Task task){
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public List<Task> getAll(){
        return taskRepository.findAll();
    }

    @Override
    @Transactional
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public String deleteTask(Task task){
        taskRepository.delete(task);
        return "Tarea eliminada con exito";
    }

    @Override
    @Transactional
    public Optional<Task> getById(int id){
        return taskRepository.findById(id);
    }
}
