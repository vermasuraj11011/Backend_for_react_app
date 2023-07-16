package com.course.springrest.services;

import com.course.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    Course create(Course course);
    Course getCourse(Integer id) throws Exception;
    List<Course> getCourses();
    Course update(Integer id, Course course) throws Exception;
    void delete(Course course) throws Exception;
}
