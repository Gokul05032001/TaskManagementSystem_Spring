package com.faith.service;

import java.util.List;
import java.util.Optional;

import com.faith.entity.Task;

public interface ITaskService {
	

	// List
	public List<Task> getTask();

	// ADD
	public Task saveTask(Task task);

	// delete
	public void deleteTask(String id);

	//get by id
	public Optional<Task> getTaskById(String id);

	public List<Task> getTaske();

//	//task complete
	public  Task  taskComplete(String id);

	public List<Task> getcmpltTasks();
	


}
