package com.leaning.demokevin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DemoKevinController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
		
		@GetMapping("/product")
		public String product() {
			return "product";
		}
}