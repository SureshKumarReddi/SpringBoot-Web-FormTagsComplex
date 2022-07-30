package com.Suresh.SpringBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Suresh.SpringBoot.Models.StudentRegistration;

@Controller
public class FirstController {


	@GetMapping("/loadform")
	public String loadForms(Model model) {
		
		StudentRegistration studObj = new StudentRegistration();
		model.addAttribute("student", studObj);
		return "index";
	}
	
	@GetMapping("/showform")
	public String goToSuccess(StudentRegistration obj,Model model) {
		model.addAttribute("student", obj);
		//System.out.println(obj); repository.java
		return "success";
	}
}
