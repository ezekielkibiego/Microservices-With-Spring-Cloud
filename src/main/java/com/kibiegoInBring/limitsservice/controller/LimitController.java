package com.kibiegoInBring.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kibiegoInBring.limitsservice.bean.Limits;

@RestController
public class LimitController {

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1,1000);
	}
}