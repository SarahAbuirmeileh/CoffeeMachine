package com.mycompany.coffeemachineProject;

/**
 *
 * @author ساره
 */
public class WasteTray {
    private int levle;
    private int capacity;

    public WasteTray() {
        setLevle(0);
        setCapacity(20);
    }

    public int getLevle() {
        return levle;
    }

    public void setLevle(int levle) {
        this.levle = levle;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void clean(){
        setLevle(0);
    }
    
}
