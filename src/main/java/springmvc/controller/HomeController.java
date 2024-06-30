package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("name", "Adhya Dashore");
		List<String> friends = new ArrayList<String>();
		friends.add("sharadha");
		friends.add("vaishali");
		friends.add("kritika");
		model.addAttribute("f", friends);
		//addAttribute(key, value);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("rollno", 1409); //adding integer without double coats
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		//creating modelAndView object since the return type is also ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data 
		modelAndView.addObject("name", "Chinu");
		modelAndView.addObject("id", 1418);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(99);
		list.add(33);
		modelAndView.addObject("marks", list); /* Marks as list */
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
 