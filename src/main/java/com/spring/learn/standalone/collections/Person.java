package com.spring.learn.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

    public List<String> getFrindsList() {
        return frindsList;
    }

    public void setFrindsList(List<String> frindsList) {
        this.frindsList = frindsList;
    }

    public Map<String, String> getFeesCourse() {
        return feesCourse;
    }

    public void setFeesCourse(Map<String, String> feesCourse) {
        this.feesCourse = feesCourse;
    }

    private Map<String,String> feesCourse;
    private List<String> frindsList;

    @Override
    public String toString() {
        return "Person{" +
                "feesCourse=" + feesCourse +
                ", frindsList=" + frindsList +
                ", dbProperties=" + dbProperties +
                '}';
    }

    public Properties getDbProperties() {
        return dbProperties;
    }

    public void setDbProperties(Properties dbProperties) {
        this.dbProperties = dbProperties;
    }

    private Properties dbProperties;
}
