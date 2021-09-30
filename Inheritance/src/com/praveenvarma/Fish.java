package com.praveenvarma;

public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int legs, int weight, int brain, int gills, int fins, int eyes) {
        super(name, legs, weight, brain);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void moveFins() {
        System.out.println("Moving fins!");
    }

    private void swim() {
        moveFins();
        System.out.println("Swimming");
        super.move(5);
    }

}
