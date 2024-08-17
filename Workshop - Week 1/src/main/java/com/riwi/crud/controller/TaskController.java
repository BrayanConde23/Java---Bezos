package com.riwi.crud.controller;

import com.riwi.crud.entity.TaskEntity;
import com.riwi.crud.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<TaskEntity> listTasks(Model model) {
        return taskService.findAll();
    }

    @GetMapping("/detail/{id}")
    public String taskDetail(
            @PathVariable("id") Long id, Model model
    ) {
        Optional<TaskEntity> task = taskService.findById(id);
        if (task.isPresent()) {
            model.addAttribute("task: ", task.get());
            return "tasks/detail";
        } else {
            return "redirect:/tasks";
        }
    }

    @PostMapping("/new")
    public ResponseEntity<TaskEntity> newTaskForm(TaskEntity task) {
        TaskEntity savedTask = taskService.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    @PostMapping("/save")
    public String saveTask(
            @ModelAttribute("task") TaskEntity task
    ) {
        task.getDateCreation(LocalDate.now());
        task.getHourCreation(LocalDate.now());
        taskService.save(task);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String editTaskForm(
            @PathVariable("id") Long id
    ) {
        Optional<TaskEntity> task = taskService.findById(id);
        if (task.isPresent()) {
            return "tasks/form";
        } else {
            return "redirect:/tasks";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(
            @PathVariable("id") Long id
    ) {
        taskService.deleteById(id);
        return "redirect:/tasks";
    }

    @PostMapping("/find")
    public String findTasks(
            @RequestParam("tittle") String tittle, Model model
    ) {
        model.addAttribute("tasks: ", taskService.findByTittleContaining(tittle));
        return "tasks/list";
    }
}
