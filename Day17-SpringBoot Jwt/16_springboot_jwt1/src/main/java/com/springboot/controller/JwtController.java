package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.JwtService;

@RestController
public class JwtController {
	
	private JwtService jwtService;
	public JwtController(JwtService jwtService) {
		this.jwtService = jwtService;
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome to JWT Example"; 
	}
	
	@PostMapping("/generateToken")
	public String generateToken(@RequestBody String Username) {
		return jwtService.generateToken(Username);
	}
	
	@GetMapping("/validateToken")
	public String validateToken(@RequestHeader("Authorization") String tk) {
	//System.out.println("Received Token : "+tk);
		String token = tk.substring(7);
		String str = jwtService.validateToken(token) ? "Valid Token" : "Invalid Token";
		return str;
	}

}

// eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ7XHJcbiAgICBcImVtYWlsXCI6XCJ3ZVwiLFxyXG4gICAgXCJwYXNzd29yZFwiOlwiMTIzXCJcclxufSIsImlhdCI6MTc3MTQ3OTQ4NywiZXhwIjoxNzcxNDgwMDg3fQ.To3RiDRUBDXcMzPjcJPlGQg8M7hNOqP2XjV2rY_A9sA
