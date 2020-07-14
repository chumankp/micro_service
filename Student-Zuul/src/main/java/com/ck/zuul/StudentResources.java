package com.ck.zuul;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class StudentResources {
	@GetMapping("/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
	}

	@GetMapping("/getStudentDetails/{name}")
	public Student getStudentDetails(@PathVariable(name = "name") String name) {
		return new Student(name, "Odisha", "MCA");
	}
}
