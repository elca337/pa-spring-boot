package uk.ac.belfastmet.service;

import java.util.ArrayList;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.tasks.Tasks;
import uk.ac.belfastmet.repository.TaskRepository;

/**
 * 
 * This is the task service for the to do list App
 * 
 * @author CAS14105696
 * @version 2.0
 * @since 23/09/2019
 */

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;	
	Logger logger = LoggerFactory.getLogger(TaskService.class);
	//function explanation
	public void getNumberOfTasks() {
		logger.info("# of Tasks: {}", taskRepository.count());
	}
	
	//class name is Task,shows List here
    

	public ArrayList<Tasks> getTaskList() {		
		
		Iterable <Tasks> tasks = new ArrayList<Tasks>();
		tasks = taskRepository.findAll();
		//tasks.add(new Tasks("Shopping", "go and get shopping", "Lee", "high", 0));
	
		return (ArrayList<Tasks>) tasks;
	}

	
}
