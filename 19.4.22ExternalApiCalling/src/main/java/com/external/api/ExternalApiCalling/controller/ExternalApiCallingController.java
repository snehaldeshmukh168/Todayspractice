package com.external.api.ExternalApiCalling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiCallingController {

	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello word";
	}
	
	@GetMapping("/callinghello")
	public String callingData()
	{
		String uri="http://localhost:8088/hello";
		RestTemplate restTemplate=new RestTemplate();
		String result=restTemplate.getForObject(uri, String.class);
		return result;
		
	}
}
