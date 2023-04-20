package com.mycompany.coffeemachineproject;

import java.util.Scanner;

/**
 *
 * @author ساره
 */
public class WasteTray {
    private int level;
    private final int capacity=20;

    // execption
    
    public WasteTray() {
        setLevel(0);
    }

    public int getLevel() {
        return level;
    }
    
    Scanner input = new Scanner(System.in);

    public void setLevel(int level) {
        if (level >= 0 && level <= capacity) {
            this.level = level;
        } else {
            do {
                System.out.println("Invalid level, try again: ");
                setLevel(input.nextInt());
            } while (level < 0 || level > capacity);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void clean() {
        setLevel(0);
    }

}
