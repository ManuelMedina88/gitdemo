package com.bolsadeideas.springboot.web.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bolsadeideas.springboot.web.app.model.User;

@Controller
@RequestMapping("/app")
public class Controllers {
	
	@GetMapping("/list")
	public ModelAndView showList(ModelAndView model) {
		
		model.addObject("title", "List of Users");
		List<User> users = Arrays.asList(
				new User("Manuel", "Medina", "anglane@hotmail.es"), new User("Amado", "Medina", "amado16@hotmail.com"),
				new User("Ricardo", "Medina", "elhijodeplata@hotmail.com"));
		model.addObject("users", users);
		model.setViewName("list");
		
		return model;
	}

}
