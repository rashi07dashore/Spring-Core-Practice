package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "Fill this form");
		m.addAttribute("description", "This form will show you your data on next page");
		m.addAttribute("successHeader", "Congratulations. You did it!");
		
	}
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		return "contact";
	}
	
	@RequestMapping(path = "processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model)
	{
		System.out.println(user);
		//process
		/* model.addAttribute("user", user); */
		
		if(user.getUserName().isBlank())
		{
			System.out.println("Data is not saved in database");
			return "redirect:/two";
		}
		else {
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User Created successfully with id: "+createdUser);
		return "formSuccess";
		}
	}
}









/*       Using @RequestParam
 
    public String handleForm(
		@RequestParam("userEmail") String email, 
		@RequestParam("userName") String name, 
		@RequestParam("userPassword") String password,
		Model model)
{
	
	 * System.out.println("user email: "+email);
	 * System.out.println("user name: "+name);
	 * System.out.println("user password: "+password);
	 
	
	User user = new User();
	user.setUserEmail(email);
	user.setUserName(name);
	user.setUserPassword(password);
	System.out.println(user);
	
	//process 
	
	 * model.addAttribute("email", email); 
	 * model.addAttribute("name", name);
	 * model.addAttribute("password", password);
	 
	
	model.addAttribute("user", user);
	return "formSuccess";
}

*/

