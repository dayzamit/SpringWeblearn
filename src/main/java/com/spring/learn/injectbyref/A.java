package com.spring.learn.injectbyref;

public class A {

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    private int X;

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    private B ob;
}
