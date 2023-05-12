package com.dp;

public class Room  {

    protected ILightSwitch lightState;

    public Room(ILightSwitch lightState) {
        this.lightState = lightState;
    }

    public void turnOn() {
        lightState = lightState.turnOn();
    }

    public void turnOff() {
        lightState = lightState.turnOff();
    }
}
