package com.course.springrest.services;

import com.course.springrest.entities.Course;
import com.course.springrest.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Course create(Course course) {
        return this.courseRepo.save(course);
    }

    @Override
    public Course getCourse(Integer id) throws Exception {
        return this.courseRepo.findById(id).orElseThrow(() -> new Exception("Order not found with id: " + id));
    }

    @Override
    public List<Course> getCourses() {
        return this.courseRepo.findAll();
    }

    @Override
    public Course update(Integer id, Course course) throws Exception {
        Course course1 = this.getCourse(id);
        course1.setName(course.getName());
        course1.setDescription(course.getDescription());
        return this.courseRepo.save(course1);
    }

    @Override
    public void delete(Course course) throws Exception {
        Course course1 = this.getCourse(course.getId());
        this.courseRepo.delete(course1);
    }


}
