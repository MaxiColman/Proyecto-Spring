package com.tasks.tasks1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasks.tasks1.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    
}
