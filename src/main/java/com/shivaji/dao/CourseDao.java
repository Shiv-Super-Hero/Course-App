package com.shivaji.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivaji.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
