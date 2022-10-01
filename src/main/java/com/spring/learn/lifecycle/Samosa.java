package com.spring.learn.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void start()
    {
        System.out.println("Inside init method");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("Inside destory method");
    }


}
