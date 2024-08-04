package com.adomasda;

interface CommonRoom {
    boolean lightIsOn();
}

interface WithBalcony extends CommonRoom {
    boolean isOpen();
}

interface WithConditioning extends CommonRoom {
    boolean isOn();
}

interface Kitchen extends CommonRoom {
    boolean isOvenOn();
}

interface ServiceRoom extends CommonRoom {
    boolean getAccess();
}

interface Garage extends CommonRoom {
    boolean isEmpty();
}

class CherryTreeHotel implements Kitchen, ServiceRoom {
    public boolean isOvenOn() { return false; }
    public boolean lightIsOn() { return false; }
    public boolean getAccess() { return false; }
}