package com.spring.config;
import com.spring.repository.CourseRepository;
import com.spring.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {

//    @Bean("courseService")
//    public CourseService courseService(){
//        return new CourseService(new CourseRepository());
//    }
//
//
//    @Bean("courseRepository")
//    public CourseRepository courseRepository(){
//        return new CourseRepository();
//
//    }
}
