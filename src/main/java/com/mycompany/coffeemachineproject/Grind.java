package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.InvalidDataException;

public class Grind {

    private int grindLevle;

    public int getGringLevle() {
        return grindLevle;
    }

    public void setGringLevle(int grindLevle) throws InvalidDataException {
        if (grindLevle >= 1 && grindLevle <= 10) {
            this.grindLevle = grindLevle;
        } else {
            throw new InvalidDataException();
        }
    }

    public void grinding() {

    }
}
