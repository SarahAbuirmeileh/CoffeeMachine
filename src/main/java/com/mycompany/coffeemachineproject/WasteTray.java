package com.mycompany.coffeemachineproject;

public class WasteTray {

    static int level = 0;
    private int capacity;

    public WasteTray() {
        this.capacity = 20;
    }
    public WasteTray(int level) {
        this.capacity = 20;
        WasteTray.level=level;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void clean() {
        level = 0;
    }

}
