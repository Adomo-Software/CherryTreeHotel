package com.adomasda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Garage garage = new CherryTreeHotel();
        WithBalcony room1 = new CherryTreeHotel();
        WithConditioning room2 = new CherryTreeHotel();

        List<Lightable> lightables = new ArrayList<>();


        for(Lightable room : lightables){
            System.out.println(room.lightIsOn());
        }

    }
}
