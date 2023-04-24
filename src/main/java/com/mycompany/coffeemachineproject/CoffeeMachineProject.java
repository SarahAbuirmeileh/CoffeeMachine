package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ساره
 */
public class CoffeeMachineProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CoffeeMachine cm = new CoffeeMachine();
        String menu = """
                      1. Single Espresso
                      2. Double Espresso
                      3. Single Americano
                      4. Double Americano
                      5. Turn off the machine
                      Enter your choice:""";
        int waterAmount=0, beansAmount =0;
        try{
            cm.start();
        }
        catch (WastedTrayException e){
            System.out.println(e.getMessage());
            System.out.println("Enter 1 if you clean the  wasted tray, other wise the machine will turn off: ");
            if (input.nextInt() == 1)
                cm.getWasteTray().clean();
            else 
                System.exit(0);
        }
        catch (EmptyBeansException e){
            System.out.println(e.getMessage());
            CoffeeMachineProject.beansHandel(cm, beansAmount);
        }
        catch (EmptyWaterException e){
            System.out.println(e.getMessage());
            CoffeeMachineProject.waterHandel(cm, waterAmount);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
   
        int choice;       
        do{
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
                System.out.println("Enter 1 if you clean the  wasted tray, other wise the machine will turn off: ");
                if (input.nextInt() == 1)
                    cm.getWasteTray().clean();
                else 
                    System.exit(0);
            }
            catch (OutOfBeansException e){
                System.out.println(e.getMessage());
                CoffeeMachineProject.beansHandel(cm, beansAmount);
            }
            catch (OutOfWaterException e){
                System.out.println(e.getMessage());
                CoffeeMachineProject.waterHandel(cm, waterAmount);
            }
            WasteTray.level++;
            System.out.println("The caffeine amount in this cup in grams = " + cm.getBeans().getCaffeine(choice));
        }while (true); 
    }
    
    public static  void beansHandel(CoffeeMachine cm, int beansAmount ) {
        Scanner input = new Scanner(System.in);
        boolean excepationOccur;
        System.out.println("Enter the beans amount that you want to add measured in gram : ");
        do {
            excepationOccur=false;
            try {
                beansAmount = input.nextInt();
                if (beansAmount<0)
                        throw new InvalidDataException();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                excepationOccur =true;
                System.out.println("You have to enter a positave integer, try again: ");
            }
            catch (InvalidDataException ex){
                   System.out.println(ex.getMessage());                    
                    excepationOccur =true;
               } 
        }while (excepationOccur);

        do {
            excepationOccur=false;
            try {
                System.out.println("Enter the Arabica Percentage %: ");
                cm.getBeans().setArabicaPercentage(input.nextInt());
                System.out.println("Enter the Robusta Percentage %: ");
                cm.getBeans().setRobustaPercentage(input.nextInt());
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                excepationOccur =true;
                System.out.println("You have to enter a positave integer, try again: ");
            }
            catch (InvalidDataException ex){
                System.out.println(ex.getMessage());   
                excepationOccur =true;
            }
        }while (excepationOccur);
    }
    
        public static void waterHandel(CoffeeMachine cm, int waterAmount) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water amount that you want to add measured in ml : ");
        boolean excepationOccur;
        do {
            excepationOccur=false;
            try {
                waterAmount = input.nextInt();
                if (waterAmount<0)
                    throw new InvalidDataException();
            }
            catch (InputMismatchException e){
                excepationOccur =true;
                System.out.println(e.getMessage());
                System.out.println("You have to enter an integer greater than zero, try again: ");
            }
            catch (InvalidDataException ex){
                System.out.println(ex.getMessage());                    
                excepationOccur =true;
            }
        }while (excepationOccur );
    }
}