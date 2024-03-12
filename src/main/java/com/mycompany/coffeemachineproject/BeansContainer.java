package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;

public class BeansContainer extends Container {

    // Beans level measured in grams
    private double arabicaPercentage;
    private double robustaPercentage;

    public BeansContainer() {
        super(500,500);
        arabicaPercentage = 0.5;
        robustaPercentage = 0.5;
    }
    public BeansContainer(int level) {
        super(level,500);
        arabicaPercentage = 0.5;
        robustaPercentage = 0.5;
    }
    
    public BeansContainer(double arabicaPercentage, double robustaPercentage) throws InvalidDataException {
        this.setCapacity(500) ;
        setArabicaPercentage(arabicaPercentage);
        setRobustaPercentage(robustaPercentage);
    }

    public final void setArabicaPercentage(double arabicaPercentage) throws InvalidDataException {
        if (arabicaPercentage >= 0 && arabicaPercentage <= 100) {
            this.arabicaPercentage = arabicaPercentage / 100;
        } else {
            throw new InvalidDataException();
        }
    }

    public double getArabicaPercentage() {
        return arabicaPercentage;
    }

    public final void setRobustaPercentage(double robustaPercentage) throws InvalidDataException {
        if (robustaPercentage >= 0 && robustaPercentage <= 100) {
            this.robustaPercentage = robustaPercentage / 100;
        } else {
            throw new InvalidDataException();
        }
    }

    public double getRobustaPercentage() {
        return robustaPercentage;
    }

    @Override
    public boolean take(int amount) {
        if (amount < getLevel()) {
            setLevel(getLevel() - amount);
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "Beans container : beans level = " + getLevel()
                + ", Arabica Percentage = " + getArabicaPercentage() * 100 + "% , "
                + ", Robusta Percentage = " + getRobustaPercentage() * 100 + "% , ";
    }

    @Override
    public void fill(int amount) throws BeansExceededCapacityException {
        if (this.getLevel() + amount > this.getCapacity()) {
            throw new BeansExceededCapacityException();
        } else {
            this.setLevel(this.getLevel() + amount);
        }
    }

    public double getCaffeine(int coffeeChoice) {
        int x = coffeeChoice % 2;
        if (x == 0) {
            x += 2;
        }
        x *= 7;
        return x * getArabicaPercentage() * 0.012 + x * getRobustaPercentage() * 0.022;
    }
}
