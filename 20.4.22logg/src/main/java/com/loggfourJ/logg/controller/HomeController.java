package com.loggfourJ.logg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/")
	String index()
	{
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warm message");
		logger.error("This is an error message");
		return "index";
	}
}
