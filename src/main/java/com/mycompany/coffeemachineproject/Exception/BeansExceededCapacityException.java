package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class BeansExceededCapacityException extends Exception{

    public BeansExceededCapacityException() {
    }

    @Override
    public String getMessage() {
        return "The beans you want to add exceeded tha beans container capacity";
    }
    
    
}
