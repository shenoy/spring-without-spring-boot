package com.spring.repository;

import com.spring.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseRepository implements CrudRepository<Course> {

    List<Course> courses;

    @Override
    public List<Course> findAll() {
        courses= new ArrayList<>();
        Course springBoot = new Course(1,
                "SpringBoot course",
                "generic description",
                "wwww.google.com");
        courses.add(springBoot);
        return courses;
    }
}
