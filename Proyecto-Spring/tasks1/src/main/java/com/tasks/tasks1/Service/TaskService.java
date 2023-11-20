package com.tasks.tasks1.Service;

import java.util.List;
import java.util.Optional;

import com.tasks.tasks1.Entity.Task;

public interface TaskService {
    
    public Task save(Task task);
    public List<Task> getAll();
    public Task updateTask(Task task);
    public String deleteTask(Task task);
    public Optional<Task> getById(int id);
}
