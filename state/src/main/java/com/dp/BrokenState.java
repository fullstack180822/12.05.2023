package com.dp;

public class BrokenState extends LightStateBase {

    @Override
    public ILightSwitch turnOn() {
        System.out.println("borken ... call electiricain ");
        return this;
    }

    @Override
    public ILightSwitch turnOff() {
        System.out.println("borken ... call electiricain ");
        return this;
    }
}
