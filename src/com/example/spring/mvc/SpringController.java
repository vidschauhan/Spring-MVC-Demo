package com.example.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@RequestMapping("/")
	public String showView() {
		return "main-menu";
	}
}
