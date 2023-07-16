package com.course.springrest.controller;

import com.course.springrest.entities.Course;
import com.course.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public ResponseEntity<String> getHome() {
        return ResponseEntity.ok("this is home page");
    }

    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourses() {
        return ResponseEntity.ok(this.courseService.getCourses());
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<Course> getCourse(
            @PathVariable Integer id
    ) throws Exception {
        return ResponseEntity.ok(this.courseService.getCourse(id));
    }

    @PostMapping("/course")
    public ResponseEntity<Course> addCourse(
            @RequestBody Course course
    ) throws Exception {
        return ResponseEntity.ok(this.courseService.create(course));
    }

    @PutMapping("/course/{id}")
    public ResponseEntity<Course> updateCourse(
            @PathVariable Integer id,
            @RequestBody Course course
    ) throws Exception {
        return ResponseEntity.ok(this.courseService.update(id, course));
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(
            @PathVariable Integer id
    ) throws Exception {
        Course course = this.courseService.getCourse(id);
        this.courseService.delete(course);
        return ResponseEntity.ok("Course deleted");
    }
}
