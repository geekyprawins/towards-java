package com.praveenvarma;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {

        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {

        this.currentDirection += direction;
        System.out.println("Vehicle.steer() called,  moving in " + currentDirection);
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() called,  moving at " + currentVelocity + " in" + currentDirection);
    }
    public void stop(){
        this.currentVelocity=0;
    }
}
