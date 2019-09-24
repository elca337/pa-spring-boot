package uk.ac.belfastmet.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.service.TaskService;
import uk.ac.belfastmet.tasks.Tasks;



@Controller
@RequestMapping
public class ToDoController {	
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")	
	public String homePage(Model model) {
		Logger logger = LoggerFactory.getLogger(ToDoController.class); 
	    logger.info("This is running");
		model.addAttribute("pageTitle", "To Do List");
		model.addAttribute("tasks", taskService.getTaskList());
		logger.info("This running 2");
		return "index";		
	}
	
//	public ArrayList<Tasks> taskList() {
//		return null;
//	}
	

	

}
