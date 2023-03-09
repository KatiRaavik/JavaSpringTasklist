package com.taskapp.taskapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskapp.taskapp.models.TaskItem;

public interface TaskItemRepository extends JpaRepository <TaskItem, Long>{
    
}
