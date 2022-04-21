package com.FoodVaibhav;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Usercontroll {
	@RequestMapping("/")
	public String getAllItems() {
		return "Hello";
	}

}
