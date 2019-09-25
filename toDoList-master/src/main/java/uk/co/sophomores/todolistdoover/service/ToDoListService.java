package uk.co.sophomores.todolistdoover.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.sophomores.todolistdoover.domain.Task;
import uk.co.sophomores.todolistdoover.repository.TaskRepository;
/**
 * Service class to initialise and populate arraylists of 
 * incomplete and complete tasks
 * @author CAS14105696
 */
@Service
public class ToDoListService {
	
	// To do list array
	public static ArrayList<Task> tasks = new ArrayList<Task>();
	public static ArrayList<Task> incompleteTasks = new ArrayList<Task>();
	public static ArrayList<Task> completeTasks = new ArrayList<Task>();
	private static final Logger lOGGER = LoggerFactory.getLogger(ToDoListService.class);
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void getNumberOfTasks() {
		lOGGER.info("# of tasks: {}", taskRepository.count());
		Iterable<Task> tasks = taskRepository.findAll();
		Iterator<Task> iterator = tasks.iterator();
		while(iterator.hasNext()) {
			lOGGER.info("{}", iterator.next().toString());
		}
	}
	
	public void findAllTasks() {
		
	}
	
	// Getters
	public static ArrayList<Task> getToDoList(){
		return tasks;
	}
	
	public ArrayList<Task> getIncompleteTasks(){
		return incompleteTasks;
	}
	
	public static ArrayList<Task> getCompleteTasks(){
		return completeTasks;
	}
	
	public static void makeToDoList() {
//		tasks.add(new Task("ToDoList", "Make a to do list website application", "High", false, "23-09-2019"));
//		tasks.add(new Task("Reseal shower", "Remove and replace the sealant in the shower", "Medium", false, "29-09-2019"));
//		tasks.add(new Task("Fix back door", "Get wood putty/filler to repair back door", "Low", false, "31-12-2019"));
//		tasks.add(new Task("Paint ceiling", "Fill the holes in the kitchen ceiling and then paint it", "Medium", false, "30-09-2019"));
//		tasks.add(new Task("Get a job", "Get a job to pay the bills", "High", false, "29-09-2019"));
//		tasks.add(new Task("Test complete task 1", "Fill the holes in the kitchen ceiling and then paint it", "Medium", true, "30-09-2019"));
//		tasks.add(new Task("Test complete task 2", "Get a job to pay the bills", "High", true, "29-09-2019"));
		lOGGER.debug("MakeIncompleteTasks: " + incompleteTasks);
		lOGGER.info("Exit: makeToDoList");
	}
	
	/**
	 * Method to create a list of incomplete tasks
	 * @return ArrayList of incomplete tasks
	 */
//	public static ArrayList<Task> makeIncompleteTasks() {
//		for(int loop = 0; loop < tasks.size(); loop++) {
//			if(tasks.get(loop).isCompleted() == false) {
//				incompleteTasks.add(tasks.get(loop));
//			}
//		}
//		lOGGER.debug("MakeIncompleteTasks: " + incompleteTasks);
//		lOGGER.info("Exit: makeIncompleteTasks");
//		return incompleteTasks;
//	}
	
	/**
	 * Method to create a list of complete tasks
	 * @return ArrayList of complete tasks
	 */
//	public static ArrayList<Task> makeCompleteTasks(){
//		for(int loop = 0; loop < tasks.size(); loop++) {
//			if(tasks.get(loop).isCompleted() == true) {
//				completeTasks.add(tasks.get(loop));
//			}
//		}
//		lOGGER.debug("MakeCompleteTasks: " + completeTasks);
//		lOGGER.info("Exit: makeCompleteTasks");
//		return completeTasks;
//	}
}