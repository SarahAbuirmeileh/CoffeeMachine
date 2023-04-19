package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ساره
 */
public class CoffeeMachineProject {

    public static void main(String[] args) throws WaterExceededCapacityException, BeansExceededCapacityException  {

        Scanner input = new Scanner(System.in);
        CoffeeMachine cm = new CoffeeMachine();
        String menu = """
                      1. Single Espresso
                      2. Double Espresso
                      3. Single Americano
                      4. Double Americano
                      5. Turn off the machine
                      Enter your choice:""";
    
        boolean emptyWater = false;
        boolean emptyBeans = false;
        try{
            cm.start();
        }
        catch (WastedTrayException e){
            System.out.println(e.getMessage());
            cm.getWasteTray().clean();
        }
        catch (EmptyBeansException e){
            System.out.println(e.getMessage());
            emptyBeans = true;
        }
        catch (EmptyWaterException e){
            System.out.println(e.getMessage());
            emptyWater=true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (emptyWater){
            System.out.println("Enter the water amount that you want to add measured in ml");
            try{
                cm.getWater().fill(input.nextInt());
            }
            catch (WaterExceededCapacityException ex){
                int amount , shouldAdd = cm.getWater().getCapacity() - cm.getWater().getLevel();
                System.out.println(ex.getMessage());
                System.out.println("Add water less than " + shouldAdd + ": ");
                amount =input.nextInt();
                while (amount<0 || amount >shouldAdd){
                    System.out.print("Try again: ");
                    amount=input.nextInt();
                }
                cm.getWater().fill(amount);
            }   
        }
        if (emptyBeans){
            System.out.println("Enter the beans amount that you want to add measured in gram");
            try{
                cm.getBeans().fill(input.nextInt());
            }
            catch (BeansExceededCapacityException ex){
                int amount, shouldAdd=cm.getBeans().getCapacity()-cm.getBeans().getLevel();
                System.out.println(ex.getMessage());
                System.out.println("Add beans less than " + shouldAdd+ ": ");
                amount =input.nextInt();
                while (amount<0 || amount >shouldAdd){
                    System.out.print("Try again: ");
                    amount=input.nextInt();
                }
                cm.getBeans().fill(amount);
                System.out.println("Enter the Arabica Percentage % and Robusta Percentage % : ");
                cm.getBeans().setArabicaPercentage(input.nextInt());
                cm.getBeans().setArabicaPercentage(input.nextInt());                
            }   
        }
        
        int choice;       
        do{
            boolean needWater = false;
            boolean needBeans = false;
            
            System.out.println(menu);
            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                continue;
            }
            
            if (choice >5 || choice < 1){
                System.out.println("Invalid choice");
                continue;
            }
            
            if (choice == 5){
                System.exit(0);
            }
            
            try {
                cm.brewer(choice);
            }
            catch (WastedTrayException e){
                System.out.println(e.getMessage());
                cm.getWasteTray().clean();
            }
            catch (OutOfBeansException e){
                System.out.println(e.getMessage());
                needBeans = true;
            }
            catch (OutOfWaterException e){
                System.out.println(e.getMessage());
                needWater = true;
            }
            
            if (needWater){
                System.out.println("Enter the water amount that you want to add measured in ml");
                try{
                    cm.getWater().fill(input.nextInt());
                }
                catch (WaterExceededCapacityException ex){
                    int amount , shouldAdd = cm.getWater().getCapacity() - cm.getWater().getLevel();
                    System.out.println(ex.getMessage());
                    System.out.println("Add water less than " + shouldAdd + ": ");
                    amount =input.nextInt();
                    while (amount<0 || amount >shouldAdd){
                        System.out.print("Try again: ");
                        amount=input.nextInt();
                    }
                    cm.getWater().fill(amount);
                 }   
            }
            if (needBeans){
                System.out.println("Enter the beans amount that you want to add measured in gram");
                try{
                cm.getBeans().fill(input.nextInt());
                }
                catch (BeansExceededCapacityException ex){
                    int amount, shouldAdd=cm.getBeans().getCapacity()-cm.getBeans().getLevel();
                    System.out.println(ex.getMessage());
                    System.out.println("Add beans less than " + shouldAdd+ ": ");
                    amount =input.nextInt();
                    while (amount<0 || amount >shouldAdd){
                        System.out.print("Try again: ");
                        amount=input.nextInt();
                    }
                    cm.getBeans().fill(amount);
                    System.out.println("Enter the Arabica Percentage % and Robusta Percentage % : ");
                    cm.getBeans().setArabicaPercentage(input.nextInt());
                    cm.getBeans().setArabicaPercentage(input.nextInt()); 
                }  
            }
        }while (true); 
    }
}