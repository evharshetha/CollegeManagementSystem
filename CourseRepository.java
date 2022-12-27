package com.edu.CMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.CMS.Domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
