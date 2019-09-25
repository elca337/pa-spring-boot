package uk.co.sophomores.todolistdoover.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.sophomores.todolistdoover.service.ToDoListService;

@Controller
@RequestMapping()
public class CompleteListController {

	Logger logger = LoggerFactory.getLogger(CompleteListController.class);
	
	@GetMapping("/completed")
	public String home(Model model){
		model.addAttribute("pagetitle", "Completed Tasks");
		model.addAttribute("tasks", ToDoListService.getCompleteTasks());
		return "completedtasks";
	}
}

