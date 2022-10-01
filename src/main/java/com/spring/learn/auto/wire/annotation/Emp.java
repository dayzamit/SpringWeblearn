package com.spring.learn.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("address1")
    public void setAddress(Address address) {
        System.out.println("Setting method call");
        this.address = address;
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp(Address address) {

        super();
        this.address = address;
        System.out.println("Inside Constructor");
    }

    private Address address;

}
