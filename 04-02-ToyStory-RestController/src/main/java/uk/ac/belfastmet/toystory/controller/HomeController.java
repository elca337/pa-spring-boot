package uk.ac.belfastmet.toystory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}

}
