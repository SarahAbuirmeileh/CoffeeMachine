package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.WaterExceededCapacityException;

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
    public boolean take(int amount) {
        if (level >= amount) {
            setLevel(getLevel() - amount);
            return true;
        }
        return false;    
    }

    @Override
    public String getInfo() {
        return "Water Container : water levle = " + this.level;
    }

    @Override
    public void fill(int amount) throws WaterExceededCapacityException{
        if (this.getLevel()+amount > this.getCapacity()){
            throw new WaterExceededCapacityException();
        }else {
            this.setLevel(this.getLevel() + amount);
        }
    }
}
