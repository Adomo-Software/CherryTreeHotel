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

interface KitchenNamespaceConflict extends CommonRoom {
    boolean isOvenOn();
}

interface ServiceRoomNamespaceConflict extends CommonRoom {
    boolean getAccess();
}

interface GarageNamespaceConflict extends CommonRoom {
    boolean isEmpty();
}

class FirstRoom implements WithBalcony {
    boolean field = false;

    public void setField(boolean set) {
        this.field = set;
    }

    public boolean isOpen() {
        return field;
    }

    public boolean lightIsOn() {
        return field;
    }
}

class SecondRoom implements WithConditioning {
    boolean field = false;

    public void setField(boolean set) {
        this.field = set;
    }

    public boolean isOn() {
        return field;
    }

    public boolean lightIsOn() {
        return field;
    }
}

class Kitchen implements KitchenNamespaceConflict {
    boolean field = false;

    public void setField(boolean set) {
        this.field = set;
    }

    public boolean isOvenOn() {
        return field;
    }

    public boolean lightIsOn() {
        return field;
    }
}


class ServiceRoom implements ServiceRoomNamespaceConflict {
    boolean field = false;

    public void setField(boolean set) {
        this.field = set;
    }

    public boolean getAccess() {
        return field;
    }

    public boolean lightIsOn() {
        return field;
    }
}

class Garage implements GarageNamespaceConflict {
    boolean field = false;

    public void setField(boolean set) {
        this.field = set;
    }

    public boolean isEmpty() {
        return field;
    }

    public boolean lightIsOn() {
        return field;
    }
}

//class CherryTreeHotel implements Kitchen, ServiceRoom {
//    public boolean isOvenOn() { return false; }
//    public boolean lightIsOn() { return false; }
//    public boolean getAccess() { return false; }
//}