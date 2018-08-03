package com.example.spring.mvc;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	public String showForm() {
		return "hello-world";
	}
	
	@RequestMapping("/processHelloWorld")
	public String processForm() {
		/*The return value is the name of the View or jsp page*/
		return "process-hello-world";
	}
	
	@RequestMapping("/showModelData")
	public String showModelData(HttpServletRequest request, Model model) {
		String data = request.getParameter("studentName"); // Here parameter name is same as in hello world jsp.
		model.addAttribute("nameOfStudent",data.toUpperCase());
		return "process-hello-world";
		
	}
	
	@RequestMapping("/showModelData1")
	public String showModelData(@RequestParam("studentName") String student, Model model) {
		model.addAttribute("nameOfStudent",student.toUpperCase());
		return "process-hello-world";
		
	}
}
