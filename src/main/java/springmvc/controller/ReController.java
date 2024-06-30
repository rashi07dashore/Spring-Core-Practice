package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("One handler ran");
		RedirectView rv = new RedirectView();
		rv.setUrl("two");  //do not put /two here otherwise it removes the springmvc project name and redirects to localhost
		// rv.setUrl("https://www.google.com");
		return rv;
		
		//return "redirect:/two";       //using redirect prefix
	}
	
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("Two handler running");
		return "two";
	}
}
