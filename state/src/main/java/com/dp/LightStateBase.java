package com.dp;

public abstract class LightStateBase implements ILightSwitch {

    final static int MAX_REPETITION = 3;

    protected int counter;

    public LightStateBase() {
        this.counter = 0;
    }
}
