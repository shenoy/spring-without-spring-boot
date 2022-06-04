package com.spring.service;

import com.spring.model.Course;
import com.spring.repository.CourseRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CourseService implements CrudService<Course>{

  private CourseRepository courseRepository;

    public CourseService( CourseRepository repository){

        courseRepository = repository;

    }


    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
