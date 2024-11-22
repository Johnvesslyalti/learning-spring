package com.institute.course.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.course.Entities.Course;

@RequestMapping("/course/")
@RestController
public class CourseController {

	@GetMapping("hello")
	public ArrayList<Course> getCourse(){
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course(1,"Java Full Stack"));
		courses.add(new Course(2,"Python Full Stack"));
		courses.add(new Course(3,"MERN Full Stack"));
		return courses;
	}
}
