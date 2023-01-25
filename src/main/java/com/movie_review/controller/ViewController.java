package com.movie_review.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
	final static Logger logger = LoggerFactory.getLogger(ViewController.class);
	@GetMapping("/rate")
	public String review() {
		logger.info("log is working");
		
		
		return "Rating 1 up to 10";
	}

}
