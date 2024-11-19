package com.sam.app.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String greet() {
		return "welcome sam!...";
	}
	@RequestMapping("about")
	public String about() {
		return "Hakuna Matata..";
	}

}
