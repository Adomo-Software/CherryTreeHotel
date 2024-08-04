package com.adomasda;

interface Kitchen {
    boolean isOvenOn();
    boolean lightIsOn();
}

interface ServiceRoom {
    boolean getAccess();
    boolean lightIsOn();
}

class CherryTreeHotel implements Kitchen, ServiceRoom {
    public boolean isOvenOn() { return false; }
    public boolean lightIsOn() { return false; }
    public boolean getAccess() { return false; }
}