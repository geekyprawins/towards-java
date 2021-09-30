package com.praveenvarma;

public class Tesla extends Car {
    private int roadService;

    public Tesla(int roadService) {
        super("Tesla", "4WD", 4, 4, 6, false);
        this.roadService = roadService;

    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity >= 10 && newVelocity <= 20) {
            changeGear(1);
        } else changeGear(2);
        if(newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

}

