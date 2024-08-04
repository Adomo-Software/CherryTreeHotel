package com.adomasda;

import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    public void SimpleHotelTest(){
        System.err.println("SimpleHotelTest");
        Kitchen kitchen = new CherryTreelHotel();
        kitchen.isOvenOn();
        kitchen.lightIsOn();

        ServiceRoom serviceRoom = new CherryTreelHotel();
        serviceRoom.getAccess();
        serviceRoom.lightIsOn();
    }
}
