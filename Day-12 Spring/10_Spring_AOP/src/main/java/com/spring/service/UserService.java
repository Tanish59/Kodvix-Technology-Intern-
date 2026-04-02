package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	public void displayUserServive() {
		System.out.println("Display method called");
	}
	
	public void drawUserService() {
		System.out.println("drawUserService method invoked");
	}

	public void showUserService() {
		System.out.println("showUserService method invoked");
		//throw new RuntimeException("Runtime exception takes place");
	}
	
	public String printName() {
		return "Andrew Anderson";
	}

}
