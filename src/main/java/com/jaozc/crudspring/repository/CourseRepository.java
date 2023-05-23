package com.jaozc.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaozc.crudspring.model.Course;

// @Repository
public interface CourseRepository extends JpaRepository<Course, Long>{   
    
}
