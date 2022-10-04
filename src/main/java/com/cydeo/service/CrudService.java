package com.cydeo.service;

import java.util.List;

public interface CrudService<T, ID> {

// by using generics we can use the same methods with different objects
    //therefore we do not to repeat methods writing code in the interfaces

//ID instead String parameter but can be any name

        T save(T user);
        T findById(ID username);
        List<T> findAll();
        void deleteById(ID username);
        void update(T object);


    }