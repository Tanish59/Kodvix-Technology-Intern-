package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("Message","This is my first Example of Spring MVC | index");
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("message","This is 2nd File of Spring MVC | about");
		return "about";
	}
}
