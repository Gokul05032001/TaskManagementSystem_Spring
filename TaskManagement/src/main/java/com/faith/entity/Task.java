package com.faith.entity;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Tasks")

public class Task {
	@Id
	private String id;
	private String taskName;
	private String teamName;
	private String Description;
	private String status;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Task(String id, String taskName, String teamName, String description,String status) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.teamName = teamName;
		this.Description = description;
		this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status ;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", teamName=" + teamName + ", Description=" + Description
				+ ", status=" + status + "]";
	}

	
	
	

}
