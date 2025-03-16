package com.shivaji.service;

import java.util.List;

import com.shivaji.entity.Course;

public interface CourseService {
	public Course getCourse(long courseId); 
	public List<Course> getCourses();
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
}
