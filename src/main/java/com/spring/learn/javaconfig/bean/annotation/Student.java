package com.spring.learn.javaconfig.bean.annotation;

import com.spring.learn.auto.wire.annotation.Address;
import org.springframework.stereotype.Component;


public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public Student(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Address  address;
    public  void doStudy()
    {
        System.out.println("Student reading call via bean annotation");
    }

}
