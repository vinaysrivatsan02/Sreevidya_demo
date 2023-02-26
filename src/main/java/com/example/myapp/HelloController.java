package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hi Sreevidya";
	}

	@GetMapping("/hi")
	public String sendHi(){
		return "Hi from vinay";
	}

}