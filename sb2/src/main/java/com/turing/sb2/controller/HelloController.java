package com.turing.sb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello2")
	@ResponseBody
	public String msg(){
		return "Hello SpringBoot2";
	}
}
