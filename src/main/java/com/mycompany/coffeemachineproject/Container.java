package com.mycompany.coffeemachineProject;

/**
 *
 * @author ساره
 */
public abstract class Container {
    
    int capacity;
    int levle;
    
    public Container(){
        this.levle =0;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevle() {
        return levle;
    }

    public void setLevle(int levle) {
        this.levle = levle;
    }
    
    public abstract boolean take(double amount);
    public abstract String getInfo();
    public abstract void fill();
}
