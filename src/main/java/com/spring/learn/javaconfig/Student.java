package com.spring.learn.javaconfig;

import org.springframework.stereotype.Component;

@Component("studentObj")
public class Student {

    public  void doStudy()
    {
        System.out.println("Student reading");
    }

}
