package com.mycompany.coffeemachineProject;

/**
 *
 * @author ساره
 */
public class WaterCntainer extends Container {

    // Water level measured in ml

    public WaterCntainer() {
        setCapacity(1000);
    }

    @Override
    public boolean take(double amount) {
        return true;
    }

    @Override
    public String getInfo() {
        return "Water levle : " + this.levle;
    }

    @Override
    public void fill() {
        this.levle = this.capacity;
    }
    
}
