package com.spring.learn.javaconfig;

import com.spring.learn.auto.wire.annotation.Address;
import com.spring.learn.injectbyref.A;
import com.spring.learn.javaconfig.bean.annotation.Student;
import com.spring.learn.lifecycle.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {


    @Bean
    public Address getAddress()
    {
        Address address=new Address();


        return address;
    }

    @Bean
    public Student getStudent()
    {
        Student studentObj= new Student(getAddress());
        return  studentObj;
    }
}
