package com.spring.learn.ci;

public class Person {

    private int personId;

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", certi=" + (false) +
                ", personName='" + personName + '\'' +
                '}';
    }

    private Certi certi;

    public Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    public Person(int personId, String personName,Certi certi) {
        this.personId = personId;
        this.personName = personName;
        this.certi=certi;
    }



    private String personName;
}
