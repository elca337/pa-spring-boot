package uk.ac.belfastmet.controller;

/**
 * 
 * This is the controller for the to do list app
 * 
 * @author CAS14105696
 * @version 2.0
 * @since 23/09/2019
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.service.TaskService;

@Controller
@RequestMapping
public class ToDoController {	
	
	@Autowired
	private TaskService taskService;
	/*
	 * @param parameters are the Model class and model instance 
	 * @return returns "index"
	 */
	@GetMapping("/")	
	public String homePage(Model model) {
		Logger logger = LoggerFactory.getLogger(ToDoController.class); 
	    logger.info("This is running");
		model.addAttribute("pageTitle", "To Do List");
		model.addAttribute("tasks", taskService.getTaskList());
		logger.info("This running 2");
		return "index";		
	}
}
