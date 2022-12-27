package com.faith.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.dao.ITaskRepository;
import com.faith.entity.Task;
@Service
public class TaskServiceImplementation implements ITaskService {
	
	@Autowired

	private ITaskRepository ITaskRepository ;


	@Override
	public List<Task> getTask() {
		// TODO Auto-generated method stub
		return (List<Task>) ITaskRepository.findAll();
	}

	@Override
	public Task saveTask(Task task) {
		return ITaskRepository.save(task);

	}

	@Override
	public void deleteTask(String id) {
		ITaskRepository.deleteById(id);
	}

	@Override
	public Optional<Task> getTaskById(String id) {
		// TODO Auto-generated method stub
		return ITaskRepository.findById(id);
	}

	@Override
	public Task taskComplete(String id) {
		Task tsk = ITaskRepository.chaneToComplete(id);
		tsk.setStatus("completed");
		ITaskRepository.save(tsk);
		return tsk;
	}

	
	@Override
	public List<Task> getTaske() {
		// TODO Auto-generated method stub
		return ITaskRepository.findd();
	}
	
	@Override
	public List<Task> getcmpltTasks() {
		
		return ITaskRepository.cmpltTasks();
	}
		

}
