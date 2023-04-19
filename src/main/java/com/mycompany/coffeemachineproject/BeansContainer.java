package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.BeansExceededCapacityException;

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

    public BeansContainer(double arabicaPercentage, double robustaPercentage) {
        this.capacity=500;
        setArabicaPercentage(arabicaPercentage);
        setRobustaPercentage(robustaPercentage);
    }
    
    public double getArabicaPercentage() {
        return arabicaPercentage;
    }

    public void setArabicaPercentage(double arabicaPercentage) {
        this.arabicaPercentage = arabicaPercentage/100;
    }

    public double getRobustaPercentage() {
        return robustaPercentage;
    }

    public void setRobustaPercentage(double robustaPercentage) {
        this.robustaPercentage = robustaPercentage/100;
    }
    
    @Override
    public boolean take(int amount) {
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
        if (getLevel()+amount > getCapacity())
            throw new BeansExceededCapacityException();
        else
            setLevel(getLevel()+amount);
    }
}
