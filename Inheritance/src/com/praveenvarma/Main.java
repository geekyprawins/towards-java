package com.praveenvarma;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Aniamal", 5, 1, 1);
        Dog dog = new Dog("Dog", 4, 3, 1, 2, 1, "Coat");
        dog.eat();
        dog.walk();
        dog.run();
        Tesla tesla = new Tesla(30);
        tesla.steer(20);
        tesla.accelerate(50);

    }
}
