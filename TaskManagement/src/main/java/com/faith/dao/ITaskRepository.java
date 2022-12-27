package com.faith.dao;

import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.stereotype.Repository;

import com.faith.entity.Task;
@Repository
public interface ITaskRepository extends MongoRepository<Task,String>{

	
	@Query("{'status': 'Not complete'}")
	public List<Task> findd();
	
	//public void chaneToComplete(String id);

	@Query("{'id':?0}")
	public  Task  chaneToComplete(String id);

	@Query("{'status': 'completed'}")
	public List<Task> cmpltTasks();

}
