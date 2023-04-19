package com.mycompany.coffeemachineproject;

/**
 *
 * @author ساره
 */
public class WasteTray {
    private int level;
    private int capacity;

    // execption
    
    public WasteTray() {
        setLevel(0);
        setCapacity(20);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void clean(){
        setLevel(0);
    }
    
}
