package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class EmptyBeansException extends Exception{

    public EmptyBeansException() {
    }

    @Override
    public String getMessage() {
        return "The beans container is empty, you have to fill it";
    }
    
    
}
