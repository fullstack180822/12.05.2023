package com.dp;

public class Main {

    public static void main(String[] args) {

        // interface - ILightSwitch
        // turnOn
        // turnOff

        // class LightSwitch implements ILightSwitch
        // member enum switch ON, OFF, BROKEN
        // member counter = 0
        // if on --> off [counter = 0]
        // if off --> on [counter = 0]
        // if on -- on
        //    counter++
        //    counter == 3 --> broken
        // if off -- off
        //    counter++
        //    counter == 3 --> broken
        // if broken --> on nothing
        // if broken --> off nothing


        Room room = new Room(new OnState());
        room.turnOn();
        room.turnOn();
        room.turnOff();
        room.turnOn();
        room.turnOff();
        room.turnOff();
        room.turnOff();
        room.turnOff();
        room.turnOn();

    }

}
