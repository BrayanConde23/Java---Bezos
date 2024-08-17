package com.riwi.crud.service;

import com.riwi.crud.entity.TaskEntity;
import com.riwi.crud.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> findById(Long id) {
        return taskRepository.findById(id);
    }

    public TaskEntity save(TaskEntity task) {
        return taskRepository.save(task);
    }

    public void deleteById(Long id) {
        if (!taskRepository.existsById(id)){
            throw new IllegalArgumentException("Doesn't exist!");
        }
        taskRepository.deleteById(id);
    }

    public List<TaskEntity> findByTittleContaining(String tittle) {
        return taskRepository.findByTittleContaining(tittle);
    }
}
