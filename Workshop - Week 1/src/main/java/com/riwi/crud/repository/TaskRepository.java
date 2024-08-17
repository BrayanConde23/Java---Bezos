package com.riwi.crud.repository;

import com.riwi.crud.entity.TaskEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    List<TaskEntity> findByTittleContaining(String tittle);
}
