package com.dp;

public class OffState extends LightStateBase {

    @Override
    public ILightSwitch turnOn() {
        System.out.println("Turning on the switch");
        return new OnState();
    }

    @Override
    public ILightSwitch turnOff() {
        System.out.println("Pressed off while off ");
        counter++;
        System.out.println("counter = " + counter);
        if (counter >= LightStateBase.MAX_REPETITION) {
            System.out.println("Congrats! the switch is broken now!");
            return new BrokenState();
        }
        return this;
    }
}
