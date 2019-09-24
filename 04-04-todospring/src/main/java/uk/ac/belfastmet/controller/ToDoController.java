package uk.ac.belfastmet.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.tasks.Tasks;



@Controller
@RequestMapping
public class ToDoController {	
	
	@GetMapping("/task")	
	public String homePage(Model model) {
	
		model.addAttribute("pageTitle", "To Do List");		
		return "index";		
	}
	
	public ArrayList<Tasks> taskList() {
		return null;
	}
	

	

}
