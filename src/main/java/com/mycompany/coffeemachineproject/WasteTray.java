package com.mycompany.coffeemachineproject;

public class WasteTray {

    static int level = 0;
    private int capacity;

    // execption
    public WasteTray() {
        this.capacity = 20;
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
