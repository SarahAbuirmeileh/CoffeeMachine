package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CoffeeMachine {
    private WaterCntainer water;
    private BeansContainer beans;
    private Grind grind;
    private WasteTray wasteTray;
    private Logger logger;

    public CoffeeMachine() {
        this.beans = new BeansContainer();
        this.grind = new Grind();
        this.wasteTray = new WasteTray();
        this.water = new WaterCntainer();
    }

    public CoffeeMachine(WaterCntainer water, BeansContainer beans, WasteTray wasteTray, Logger logger) {
        this.water = water;
        this.beans = beans;
        this.grind = new Grind();
        this.wasteTray = wasteTray;
        this.logger=logger;
    }

    public WaterCntainer getWater() {
        return water;
    }

    public void setWater(WaterCntainer water) {
        this.water = water;
    }

    public BeansContainer getBeans() {
        return beans;
    }

    public void setBeans(BeansContainer beans) {
        this.beans = beans;
    }

    public Grind getGrind() {
        return grind;
    }

    public void setGrind(Grind grind) {
        this.grind = grind;
    }

    public WasteTray getWasteTray() {
        return wasteTray;
    }

    public void setWasteTray(WasteTray wasteTray) {
        this.wasteTray = wasteTray;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void stop(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coffee_machine", "safa", "1234")) {
                
                int a = this.beans.level, b = this.water.getLevel(), c = WasteTray.level; 
                int d=(int) (this.beans.getArabicaPercentage()*100);
                int e= (int) (this.beans.getRobustaPercentage()*100);
                String insertSql = "INSERT INTO objects_data (beans_amount,water_amount,wasted_tray,arabica_percentage,robusta_percentage) VALUES("+a+","+b+","+c+","+d+","+e+")";
                PreparedStatement preparedStmt = con.prepareStatement(insertSql);
                preparedStmt.execute();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public CoffeeMachine start() {
        
   String sql = "SELECT beans_amount, water_amount, wasted_tray,arabica_percentage, robusta_percentage " +
                     "FROM objects_data";

        CoffeeMachine cm = new CoffeeMachine();
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coffee_machine", "safa", "1234");
             java.sql.Statement stmt  = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             
            while (rs.next()) {
                int waterAmount = rs.getInt("water_amount");
                int beansAmount = rs.getInt("beans_amount");
                int wastedTrayLevel = rs.getInt("wasted_tray");
                cm =new CoffeeMachine(new WaterCntainer(waterAmount), new BeansContainer(beansAmount), new WasteTray(wastedTrayLevel),this.logger);
                cm.getBeans().setArabicaPercentage(rs.getInt("arabica_percentage"));
                cm.getBeans().setRobustaPercentage(rs.getInt("robusta_percentage"));
            }
             rs.close();
             stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        
       return cm;
    }
    


    
   

 

    public void brewer(int coffeeChoice, int grindLevel) throws WastedTrayException, OutOfBeansException, OutOfWaterException {

        if (WasteTray.level == this.wasteTray.getCapacity()) {
            throw new WastedTrayException();
        }
        
        int x = coffeeChoice % 2;
        if (x == 0) x += 2;
        boolean beansEnough = beans.take(7 * x);
        if (!beansEnough) {
            throw new OutOfBeansException();
        }
        
        boolean waterEnough = false;
        switch (coffeeChoice) {
            case 1, 2 ->
                waterEnough = water.take(30 * coffeeChoice);
            case 3 ->
                waterEnough = water.take(170);
            case 4 ->
                waterEnough = water.take(220);
        }
        if (!waterEnough) {
            throw new OutOfWaterException();
        }
        try {
            this.grind.setGringLevle(grindLevel);
        } catch (InvalidDataException ex) {
           // we will set the value after being sure that is sutabile
        }
        grind.grinding();
        WasteTray.level++;
    }
}
