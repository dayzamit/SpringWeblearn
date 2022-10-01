package com.spring.learn.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{2+5}")
    private int X;
@Value("#{7+11}")
    private int Y;
@Value("#{T(java.lang.Math).sqrt(144)}")
private double Z;

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }
@Value("#{T(java.lang.Math).E}")
    private double E;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Value("#{new String('amit')}")
    private String name;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "X=" + X +
                ", Y=" + Y +
                ", Z=" + Z +
                ", E=" + E +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
@Value("#{4<5}")
    private boolean isActive;

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

}
