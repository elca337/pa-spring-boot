package uk.ac.belfastmet.topten.controller;
 

//spring imports
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// topten music service import
import uk.ac.belfastmet.topten.service.MusicService;


// Spring Controller
@Controller
@RequestMapping
public class MusicController {
	
	// Spring GetMapping 
	/**
	 * music getMapping
	 * @param model
	 * @return
	 */
	@GetMapping("/music")
	public String musicPage(Model model) {
		
		MusicService musicservice = new MusicService();
		model.addAttribute("pageTitle", "Top Ten music");
		model.addAttribute("Music", musicservice.getTopTenMusic());
		
		return "music";
	}
	
	

}
