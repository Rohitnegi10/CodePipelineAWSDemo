package com.cognizant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping
	@ResponseBody
	String homePage()
	{
		return "Home Works";
	}
}
