package uk.ac.belfastmet.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.tasks.Tasks;


@Service
public class TaskService {
	
	//class name is Task,shows List here
    ArrayList<Tasks> Tasks;

	public ArrayList<Tasks> getTaskList() {		
		
		
		this.Tasks = new ArrayList<Tasks>();		
		this.Tasks.add(new Tasks("Shopping", "go and get shopping", "Lee", 26092019));
	
		return this.getTaskList();
	}

	
}
