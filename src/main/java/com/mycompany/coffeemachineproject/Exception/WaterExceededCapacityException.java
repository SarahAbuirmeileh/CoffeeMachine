package com.mycompany.coffeemachineproject.Exception;

public class WaterExceededCapacityException extends Exception {

    public WaterExceededCapacityException() {
    }

    @Override
    public String getMessage() {
        return "The water you want to add exceeded tha water container capacity";
    }

}

