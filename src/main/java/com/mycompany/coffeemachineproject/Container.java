package com.mycompany.coffeemachineproject;

public abstract class Container {

    protected int capacity;
    protected int level;

    public Container() {
        this.level = this.capacity;
    }
    
    public Container(int level, int capacity) {
        this.level = level;
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean setLevel(int level) {
        if (level <= this.capacity && level >= 0) {
            this.level = level;
            return true;
        }
        return false;
    }

    public abstract boolean take(int amount);

    public abstract String getInfo();

    public abstract void fill(int amount) throws Exception;
}
