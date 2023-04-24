
package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;

/**
 *
 * @author ساره
 */
public class BeansContainer extends Container {
    
    // Beans level measured in grams

    private double arabicaPercentage;
    private double robustaPercentage;
    
    public BeansContainer( ) {
        this.capacity=500;
        arabicaPercentage=0;
        robustaPercentage=0;
    }

    public BeansContainer(double arabicaPercentage, double robustaPercentage) throws InvalidDataException {
        this.capacity=500;
        setArabicaPercentage(arabicaPercentage);
        setRobustaPercentage(robustaPercentage);
    }
    
    public double getArabicaPercentage() {
        return arabicaPercentage;
    }

    public final void setArabicaPercentage(double arabicaPercentage) throws InvalidDataException{
        if (arabicaPercentage >= 0 && arabicaPercentage <= 100) 
            this.arabicaPercentage = arabicaPercentage / 100;
        else
            throw new InvalidDataException();
    }

    public double getRobustaPercentage() {
        return robustaPercentage;
    }

    public final void setRobustaPercentage(double robustaPercentage) throws InvalidDataException{
        if (robustaPercentage >= 0 && robustaPercentage <= 100) 
            this.robustaPercentage = robustaPercentage / 100;
        else
            throw new InvalidDataException();
    }
    
    @Override
    public boolean take(int amount){
        if (amount < getLevel()){
            setLevel(getLevel()-amount);
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "Beans container : beans level = " + getLevel() + 
               ", Arabica Percentage = " + getArabicaPercentage()* 100 + "% , " +
                ", Robusta Percentage = " + getRobustaPercentage()* 100 + "% , ";
    }

    @Override
    public void fill(int amount) throws BeansExceededCapacityException {
        if (this.getLevel()+amount > this.getCapacity()){
            throw new BeansExceededCapacityException();
        }else {
            this.setLevel(this.getLevel() + amount);
        }
    }
}
