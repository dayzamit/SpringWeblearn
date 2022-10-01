package com.spring.learn.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
       // loadEmpCollViaIOC();
    }
    public static void loadEmpCollViaIOC()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");

    }
}
