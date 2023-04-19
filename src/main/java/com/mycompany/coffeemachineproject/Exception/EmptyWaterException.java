package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class EmptyWaterException extends Exception {

    public EmptyWaterException() {
    }

    @Override
    public String getMessage() {
        return "The water container is empty, you have to fill it";
    }
    
    
}
