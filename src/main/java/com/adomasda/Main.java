package com.adomasda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new CherryTreeHotel();

        kitchen.isOvenOn();
        kitchen.lightIsOn();

        ServiceRoom serviceRoom = new CherryTreeHotel();
        serviceRoom.getAccess();
        serviceRoom.lightIsOn();

        Garage garage = new CherryTreeHotel();
        FirstRoom firstRoom = new CherryTreeHotel();
        SecondRoom SecondRoom = new CherryTreeHotel();
        interface Spa extends CommonRoom {
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
        spa.isWaterWarm();

        List<CommonRoom> rooms = new ArrayList<>();
        rooms.add(garage);
        rooms.add(kitchen);
        rooms.add(serviceRoom);
        rooms.add(firstRoom);
        rooms.add(SecondRoom);
        rooms.add(spa);

        for(CommonRoom room : rooms){
            System.out.println(room.lightIsOn());
        }
    }
}
