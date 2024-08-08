package com.soniya.movie_ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
 @GetMapping("/signup")
 public String loadCustomerSignup()
 {
	 return "customer-signup.html";
 }
	
}
