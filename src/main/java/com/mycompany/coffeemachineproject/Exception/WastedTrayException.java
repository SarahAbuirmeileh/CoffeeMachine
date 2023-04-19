package com.mycompany.coffeemachineproject.Exception;

/**
 *
 * @author ساره
 */
public class WastedTrayException extends Exception{

    public WastedTrayException() {
    
    }

    @Override
    public String getMessage() {
        return "The wasted tray is full, you must clean it";
    }
}
