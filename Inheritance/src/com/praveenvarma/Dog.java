package com.praveenvarma;

public class Dog extends Animal {
    private int eyes;
    private int tail;
    private String coat;

    public Dog(String name, int legs, int weight, int brain, int eyes, int tail, String coat) {
        super(name, legs, weight, brain);
        this.eyes = eyes;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew() {

        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }

    private void moveLegs() {
        System.out.println("MoveLegs called");
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

}
