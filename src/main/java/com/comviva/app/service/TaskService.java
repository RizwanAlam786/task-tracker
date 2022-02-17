package com.comviva.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comviva.app.dto.Task;
import com.comviva.app.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> listTasks() {
		List<Task> tasks=taskRepository.findAll();
		return tasks;
	}
	
	public void saveTask(Task task) {
		// validate data is valid or not
		// if valid save
		taskRepository.save(task);
	}

}
