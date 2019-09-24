package uk.ac.belfastmet.service;

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.tasks.Tasks;
import uk.ac.belfastmet.repository.TaskRepository;



@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	Logger logger = LoggerFactory.getLogger(TaskService.class);
	
	public void getNumberOfTasks() {
		logger.info("# of Tasks: {}", taskRepository.count());
	}
	
	//class name is Task,shows List here
    ArrayList<Tasks> Tasks;

	public ArrayList<Tasks> getTaskList() {		
		
		
		this.Tasks = new ArrayList<Tasks>();		
		this.Tasks.add(new Tasks("Shopping", "go and get shopping", "Lee", 26092019));
	
		return this.getTaskList();
	}

	
}
