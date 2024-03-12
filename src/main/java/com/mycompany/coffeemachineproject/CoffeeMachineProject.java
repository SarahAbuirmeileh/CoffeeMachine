package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMachineProject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CoffeeMachine cm = new CoffeeMachine();
        cm = cm.start();
        LoggerDatabaise loggerDatabaise = new LoggerDatabaise();
        cm.setLogger(loggerDatabaise);
        
        String menu = """
                      1. Single Espresso
                      2. Double Espresso
                      3. Single Americano
                      4. Double Americano
                      5. Turn off the machine
                      Enter your choice:""";

        int choice = 0;
        do {
            boolean needBeans = false, needWater = false;
            System.out.println(menu);
            do {
                try {
                    choice = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Pleas enter one of these number 1,2,3,4 or 5 to determine your choice");
                }
                input.nextLine();
            } while (true);
            int grindLevelInput =0;
            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter the grind level that you want: ");
                do {
                    try {
                        grindLevelInput = input.nextInt();
                        cm.getGrind().setGringLevle(grindLevelInput);
                        cm.getGrind().grinding();
                        break;
                    } catch (InvalidDataException e) {
                        System.out.println(e.getMessage() + ", you must enter a number in range 1 to 10, try again ");
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter an integer ");
                    }
                    input.nextLine();
                } while (true);
            }

            if (choice > 5 || choice < 1) {
                System.out.println("Invalid choice, look carefully to the menu below ");
                continue;
            }
            if (choice == 5) {
                cm.stop();
                System.exit(0);
            }
            int beansAmount =0, waterAmount=0;
            try {
                cm.brewer(choice,  grindLevelInput);
            } catch (WastedTrayException e) {
                System.out.println(e.getMessage());
                System.out.println("Enter 1 if you want to clean the  wasted tray, other wise the machine will turn off: ");
                if (input.nextInt() == 1) {
                    cm.getWasteTray().clean();
                    cm.stop();
                    cm.getLogger().log("The wasted tray has been cleaned");
                } else {
                    System.exit(0);
                }
            } catch (OutOfBeansException e) {
                System.out.println(e.getMessage());
                beansAmount = CoffeeMachineProject.beansHandel(cm);
                needBeans = true;
            } catch (OutOfWaterException e) {
                System.out.println(e.getMessage());
                waterAmount = CoffeeMachineProject.waterHandel(cm);
                needWater = true;
            }
            if (needBeans) {
                do {
                    try {
                        cm.getBeans().fill(beansAmount);
                        cm.getLogger().log("The beans container has been added " + beansAmount + "grams of beans"
                                + "\nthe arabica percantage:" + cm.getBeans().getArabicaPercentage() + " and robusta percantage :"
                                + cm.getBeans().getRobustaPercentage());
                        cm.stop();
                        break;
                    } catch (BeansExceededCapacityException e) {
                        System.out.println(e.getMessage());
                        beansAmount = CoffeeMachineProject.beansHandel(cm);
                   }
                } while (true);
            }
            if (needWater) {
                do {
                    try {
                        cm.getWater().fill(waterAmount);
                        cm.getLogger().log("The water container has been added " + waterAmount + "ml of water");
                        cm.stop();
                        break;
                    } catch (WaterExceededCapacityException e) {
                        System.out.println(e.getMessage());
                        waterAmount = CoffeeMachineProject.waterHandel(cm);
                    }
                } while (true);
            }
            System.out.println("The coffee cup has been made successfully!!");
            System.out.println("The caffeine amount in this cup in grams"
                    + " = " + cm.getBeans().getCaffeine(choice));
            String coffeeType = "";
            switch (choice) {
                case 1 -> coffeeType = "Single Espresso";
                case 2 -> coffeeType = "Double Espresso";
                case 3 -> coffeeType = "Single Americano";
                case 4 -> coffeeType = "Double Americano";
            }
            cm.getLogger().log("The" + coffeeType + "cup has been mad successfully, " 
            +"with caffeine amount " + cm.getBeans().getCaffeine(choice) );
            cm.stop();
        } while (true);
    }

    public static int beansHandel(CoffeeMachine cm) {
        int beansAmount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the beans amount that you want to add measured in gram : ");
        do {
            try {
                beansAmount = input.nextInt();
                if (beansAmount < 0 || beansAmount > cm.getBeans().getCapacity()) {
                    throw new InvalidDataException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a positave integer, try again: ");
            
            } catch (InvalidDataException ex) {
                System.out.println(ex.getMessage() +" must enter a positive number and not greater than the beans capacity ( "+cm.getBeans().getCapacity()+" ), Enter again");
            }
            input.nextLine();
        } while (true);

        do {
            try {
                System.out.println("Enter the Arabica Percentage %, an integer from 1 to 100: ");
                double arabicaPercentage = input.nextInt();
                cm.getBeans().setArabicaPercentage(arabicaPercentage);
                System.out.println("So the Robusta Percentage %: " + (100 - arabicaPercentage) + "%");
                cm.getBeans().setRobustaPercentage(100-arabicaPercentage);
                break;
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a positave integer, try again: ");
            } catch (InvalidDataException ex) {
                System.out.println(ex.getMessage() + ", must Enter number in range 0 to 100 ");
            }
            input.nextLine();
        } while (true);
        return beansAmount;
    }

    public static int waterHandel(CoffeeMachine cm) {
        int waterAmount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water amount that you want to add measured in ml : ");
        do {
            try {
                waterAmount = input.nextInt();
                if (waterAmount < 0 || waterAmount > cm.getWater().getCapacity()) {
                    throw new InvalidDataException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("You have to enter an positive integer, try again: ");
            } catch (InvalidDataException ex) {
                
                System.out.println(ex.getMessage() + ", must enter a positive number and not greater than the water capacity ( "+cm.getWater().getCapacity()+" ), Enter again");
            }
            input.nextLine();
        } while (true);
        return waterAmount;
    }
}