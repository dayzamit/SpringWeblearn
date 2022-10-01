package com.spring.learn.injectbyref;

public class B {

    private int Y;

    @Override
    public String toString() {
        return "B{" +
                "Y=" + Y +
                '}';
    }


    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }


}
