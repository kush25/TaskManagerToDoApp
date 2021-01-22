package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import com.hcl.CustomExceptions.UserNotFound;
import com.hcl.model.Useradd;
import com.hcl.service.UserService;

@Controller
public class UserContoller {

	@Autowired
	UserService uservice;

	
	@GetMapping("/regstr")
	public ModelAndView adding() {
		Useradd f1 = new Useradd();
		return new ModelAndView("register","form",f1);
	}
	
	
	
	@PostMapping("/regstr")
	public String registers(@RequestParam("uname")String uname, @RequestParam("upass")String upass,
			@RequestParam("uemail")String uemail) {

		if (uservice.addUser(uname, upass, uemail)) {
			return ("redirect:/login");
		}

		return "check details";
	}
	
	
	@GetMapping("/login")
	public String loginUser() {
		return "login";
	}

	@PostMapping("/login")
	public RedirectView logined(@RequestParam("uname") String username, @RequestParam("upass") String password,
			RedirectAttributes ra) throws UserNotFound  {

		
		try {
			Useradd u = Useradd.builder().uname(username).upass(password).build();
			u = uservice.login(u);
			if (u != null) {
				RedirectView rv = new RedirectView("/addfeeds", true);
				ra.addFlashAttribute("user", u);
				return rv;
			}
			
		}catch (Throwable e) {
			throw new UserNotFound("UserNot Found or Wrong Credentials", e);
		}
			
		ra.addFlashAttribute("username", username);
		return new RedirectView("/regstr", true);
	}
	
	
	
}
