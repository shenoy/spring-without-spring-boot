package com.spring.service;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CrudService<T> {

    List<T> list();
    T create(T t);
    Optional<T> get(int id);
    void update(T t, int id);
    void delete(int id);

}
