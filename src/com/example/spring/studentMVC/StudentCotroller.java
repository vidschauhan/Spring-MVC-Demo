package com.example.spring.studentMVC;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentCotroller {

	@RequestMapping(value = "/getStudentForm")
	public String getStudentForm(Model model) {
		/*first add the student attribute in Model*/
		model.addAttribute("student",new Student());
		return "student-form";
	}
	
	
	@RequestMapping(value = "/processStudentForm")
	public String processStudentForm(@Valid @ModelAttribute Student student,BindingResult binding) {
		/*now retrive the modelAttribute from Model.class*/ 
		if(!binding.hasErrors()) {
		System.out.println("Student data : " + student.getFirstName() + " " + student.getLastName());
		return "process-student-form";}
		else {
			return "student-form";
		}
	}
	
}
