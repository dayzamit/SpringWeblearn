package com.spring.learn.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
    }


    private Address address;

}
