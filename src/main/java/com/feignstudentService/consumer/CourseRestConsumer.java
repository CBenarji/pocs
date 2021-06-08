package com.feignstudentService.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "COURSE-SERVICE")
public interface CourseRestConsumer {
	
	@GetMapping("/course/info")
	public String getCourseDetails();

}
