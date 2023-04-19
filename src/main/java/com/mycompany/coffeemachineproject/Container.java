package com.mycompany.coffeemachineproject;

/**
 *
 * @author ساره
 */
public abstract class Container {
    
    protected int capacity;
    protected int level;
    
    public Container(){
        this.level =0;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public abstract boolean take(int amount);
    public abstract String getInfo();
    public abstract void fill(int amount) throws Exception;
}
