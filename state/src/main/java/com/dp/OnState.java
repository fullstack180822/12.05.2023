package com.dp;

public class OnState extends LightStateBase {

    @Override
    public ILightSwitch turnOn() {
        System.out.println("Pressed on while on ");
        counter++;
        System.out.println("counter = " + counter);
        if (counter >= LightStateBase.MAX_REPETITION) {
            System.out.println("Congrats! the switch is broken now!");
            return new BrokenState();
        }
        return this;
    }

    @Override
    public ILightSwitch turnOff() {
        System.out.println("Turning off the switch");
        return new OffState();
    }
}
