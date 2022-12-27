package com.faith.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.faith.entity.Task;
import com.faith.service.ITaskService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TaskController {	
	
	@Autowired
	private ITaskService ITaskService;
	
	//list
	@GetMapping("/Tasks")
	public List<Task> getAllTasks(){
		
		return ITaskService.getTask();
		
	}
     //insert
	@PostMapping("/Tasksave")
	public Task addTasks(@RequestBody Task app) {
		return ITaskService.saveTask(app);
	}
	
	@GetMapping("/TaskById/{id}")
	public Optional<Task> getTaskById(@PathVariable String id){
		return ITaskService.getTaskById(id) ;
		
	}
	
//	// update Employee
	@GetMapping("/TaskComplete/{id}")
	public  Task  taskComplete(@PathVariable String id) {
		//tsk.setStatus("complete");
//		Task tsk = ITaskService.taskComplete(id);
//		tsk.setStatus("complete");
		return ITaskService.taskComplete(id);
	}
//	
	//delete 
	@DeleteMapping("/deletetask/{id}")
	public void deleteTasks(@PathVariable String id) {
		ITaskService.deleteTask(id);
	}
	
	
	@GetMapping("/Taskers")
	public List<Task> getAllLabTests(){
		
		return ITaskService.getTaske();
		
	}
	
	@GetMapping("/TasksComp")
	public List<Task> getOnlyComplete(){
		
		return ITaskService.getcmpltTasks();
		
	}

}
