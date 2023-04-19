package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class OutOfBeansException extends Exception{

    public OutOfBeansException() {
    }

    @Override
    public String getMessage() {
        return "Out of beans, thee isn't enough beans, you have to fill it";
    }
    
    
}
