package com.praveenvarma;

public class Animal {
    private String name;
    private int legs;
    private int weight;
    private int brain;


    public Animal(String name, int legs, int weight, int brain) {
        this.name = name;
        this.legs = legs;
        this.weight = weight;
        this.brain = brain;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }
}
