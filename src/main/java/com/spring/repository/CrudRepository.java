package com.spring.repository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CrudRepository <T> {

    List<T> findAll();
}
