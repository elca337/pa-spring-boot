package uk.co.sophomores.todolistdoover.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.sophomores.todolistdoover.service.ToDoListService;

@Controller
@RequestMapping()
public class ListController {
	
	@Autowired
	private ToDoListService toDoListService;
	
	Logger logger = LoggerFactory.getLogger(ListController.class);
	
	@GetMapping("/list")
	public String home(Model model){
		model.addAttribute("pagetitle", "To Do List");
		model.addAttribute("tasks", toDoListService.getIncompleteTasks());
		toDoListService.getNumberOfTasks();
		toDoListService.findAllTasks();
		return "list";
	}
}
