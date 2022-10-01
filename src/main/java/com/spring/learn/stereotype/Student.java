package com.spring.learn.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("stuObj")
@Scope("prototype")
public class Student
{

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cityName='" + cityName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", addressList=" + addressList +
                '}';
    }

    @Value("JaiPur")
    private String cityName;
    @Value("Denial Sharma")
    private String studentName;

    @Value("#{addressList}")
    private List<String> addressList;


}
