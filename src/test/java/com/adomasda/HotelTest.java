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
        lightables.add(garage);
        lightables.add(kitchen);
        lightables.add(serviceRoom);
        lightables.add(room1);
        lightables.add(room2);

        interface Spa extends Lightable {
            boolean isWaterWarm();
        }
        class CherryTreeSpa extends  CherryTreeHotel implements Spa {
            private boolean waterWarm;
            CherryTreeSpa() {
                this.waterWarm = false;
            }
            public boolean isWaterWarm() {
                return this.waterWarm;
            }
        };

        Spa spa = new CherryTreeSpa();

        lightables.add(spa);

        for(Lightable room : lightables){
            System.out.println(room.lightIsOn());
        }

    }
}
