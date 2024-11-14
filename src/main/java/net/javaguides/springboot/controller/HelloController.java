package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping({"/", "/hello"})
	public String hello(@RequestParam(value = "name", defaultValue = "World",
	required = true) String name, Model model) {
		
		System.out.println("--Hello Controller--");
		model.addAttribute("name", name);
		return "hello";
	}
	
	
	@GetMapping("/index")
	public String index(String name, Model model) {
		System.out.println("--Index Controller--");
		model.addAttribute("name", name);
		return "index";
	}
	
	@PostMapping("/login")
	public String login(String name,Model model) {
		System.out.println("------Login Controller-----");
		
		return "success";
	}
	
}
