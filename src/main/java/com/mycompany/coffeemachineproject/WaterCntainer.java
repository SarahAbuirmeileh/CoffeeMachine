package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.WaterExceededCapacityException;

public class WaterCntainer extends Container {

    // Water level measured in ml
    public WaterCntainer() {
        super(1000,1000);
        setCapacity(1000);
    }
    
    public WaterCntainer(int level ) {
        super(level,1000);
        this.setCapacity(1000);
    }
    
    @Override
    public boolean take(int amount) {
        if (this.getLevel() >= amount) {
            setLevel(this.getLevel() - amount);
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "Water Container : water levle = " + this.getLevel();
    }

    @Override
    public void fill(int amount) throws WaterExceededCapacityException {
        if (this.getLevel() + amount > this.getCapacity()) {
            throw new WaterExceededCapacityException();
        } else {
            this.setLevel(this.getLevel() + amount);
        }
    }
}
