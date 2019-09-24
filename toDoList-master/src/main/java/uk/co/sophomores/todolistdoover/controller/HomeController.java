package uk.co.sophomores.todolistdoover.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.co.sophomores.todolistdoover.service.ToDoListService;

@Controller
@RequestMapping()
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	boolean listMade = false;
	
	@GetMapping("/")
	public String home(){
		if(!listMade) {
			ToDoListService.makeToDoList();
			ToDoListService.makeCompleteTasks();
			ToDoListService.makeIncompleteTasks();
			listMade = true;
		}
		return "index";
	}
	
	@GetMapping("/index")
	public String index(){
		logger.info("howdy");
		if(!listMade) {
			ToDoListService.makeToDoList();
			ToDoListService.makeCompleteTasks();
			ToDoListService.makeIncompleteTasks();
			listMade = true;
		}
		return "index";
	}
}
