package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class InvalidDataException extends Exception{

    public InvalidDataException() {
    }

    @Override
    public String getMessage() {
        return "Invalid data";
    }
    
    
}
