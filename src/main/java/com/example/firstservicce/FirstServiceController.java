package com.example.firstservicce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {

	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("test");
		return "Welcome to the First Service";
	}
	
	@GetMapping("/message")
	public String message(@RequestHeader("first-request") String header) {
		log.info(header);
		return "Hello World in First Service";
	}
	
	@GetMapping("/check")
	public String check() {
		return "Hi there This is message from first service";
	}
}
