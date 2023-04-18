package com.mycompany.coffeemachineProject;

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
        setCapacity(500);
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
    public boolean take(double amount) {
        return true;
    }

    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public void fill() {
        this.levle = this.capacity;
    }
}
