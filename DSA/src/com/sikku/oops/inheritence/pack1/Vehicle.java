package com.sikku.oops.inheritence.pack1;

public class Vehicle {
    private int maxSpeed;
    protected int num = 10;

    protected int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
