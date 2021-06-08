package com.feignstudentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignstudentService.consumer.CourseRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private CourseRestConsumer consumer;
	@Value("${server.port}")
	private String port;

	@GetMapping("/info")
	public String getStudentData() {
		return "student service call Course service" + consumer.getCourseDetails() +port;

	}

}
