package com.adomasda;

import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    public void SimpleHotelTest(){
        System.err.println("SimpleHotelTest");
        Kitchen kitchen = new CherryTreeHotel();
        kitchen.isOvenOn();
        kitchen.lightIsOn();

        ServiceRoom serviceRoom = new CherryTreeHotel();
        serviceRoom.getAccess();
        serviceRoom.lightIsOn();
    }
}
