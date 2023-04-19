package com.mycompany.coffeemachineproject;

import java.util.Scanner;

/**
 *
 * @author ساره
 */
public class WasteTray {
    private int level;
    private int capacity;

    // execption
    
    public WasteTray() {
        setLevel(0);
        setCapacity(20);
    }

    public int getLevel() {
        return level;
    }
    
    Scanner input = new Scanner(System.in);
    public void setLevel(int level) {
        if (level >=0 && level <= capacity)
            this.level = level;
        else {
            System.out.println("Invalid level, try again: ");
            setLevel(input.nextInt());
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void clean(){
        setLevel(0);
    }
    
}
