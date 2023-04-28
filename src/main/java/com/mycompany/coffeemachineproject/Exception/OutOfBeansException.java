package com.mycompany.coffeemachineproject.Exception;


public class OutOfBeansException extends Exception{

    public OutOfBeansException() {
    }

    @Override
    public String getMessage() {
        return "Out of beans, there isn't enough beans, you have to fill it";
    }
    
    
}
