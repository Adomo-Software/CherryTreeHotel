package com.adomasda;

class CherryTreeHotel implements Kitchen, ServiceRoom, FirstRoom, SecondRoom, Garage {
    private boolean kitchenLightOn;
    private boolean serviceRoomLightOn;
    private boolean balconyLightOn;
    private boolean conditioningLightOn;
    private boolean garageLightOn;
    private boolean ovenOn;
    private boolean accessGranted;
    private boolean balconyOpen;
    private boolean conditioningOn;
    private boolean garageEmpty;

    public CherryTreeHotel() {
        this.kitchenLightOn = false;
        this.serviceRoomLightOn = false;
        this.balconyLightOn = false;
        this.conditioningLightOn = false;
        this.garageLightOn = false;
        this.ovenOn = false;
        this.accessGranted = false;
        this.balconyOpen = false;
        this.conditioningOn = false;
        this.garageEmpty = true;
    }

    public boolean isOvenOn() {
        return ovenOn;
    }

    public boolean lightIsOn() {
        return kitchenLightOn;
    }

    public boolean getAccess() {
        return accessGranted;
    }

    public boolean isOpen() {
        return balconyOpen;
    }

    public boolean isOn() {
        return conditioningOn;
    }

    public boolean isEmpty() {
        return garageEmpty;
    }

    public void setKitchenLightOn(boolean state) {
        this.kitchenLightOn = state;
    }

    public void setServiceRoomLightOn(boolean state) {
        this.serviceRoomLightOn = state;
    }

    public void setBalconyLightOn(boolean state) {
        this.balconyLightOn = state;
    }

    public void setConditioningLightOn(boolean state) {
        this.conditioningLightOn = state;
    }

    public void setGarageLightOn(boolean state) {
        this.garageLightOn = state;
    }

    public void setOvenOn(boolean state) {
        this.ovenOn = state;
    }

    public void setAccessGranted(boolean state) {
        this.accessGranted = state;
    }

    public void setBalconyOpen(boolean state) {
        this.balconyOpen = state;
    }

    public void setConditioningOn(boolean state) {
        this.conditioningOn = state;
    }

    public void setGarageEmpty(boolean state) {
        this.garageEmpty = state;
    }
}