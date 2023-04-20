package com.mycompany.coffeemachineproject;

import java.util.Scanner;

/**
 *
 * @author ساره
 */
public class Grind {
    
    private  int grindLevle;

    public int getGringLevle() {
        return grindLevle;
    }
    Scanner input = new Scanner(System.in);

    public void setGringLevle(int grindLevle) {
        if (grindLevle >= 1 && grindLevle <= 10) {
            this.grindLevle = grindLevle;
        } else {
            do {
                System.out.println("Plz enter a number in range 1 to 10 ");
                setGringLevle(input.nextInt());
            } while (grindLevle < 1 || grindLevle > 10);
        }
    }

    public void grinding(int gringLevle ){
        
    }
}
