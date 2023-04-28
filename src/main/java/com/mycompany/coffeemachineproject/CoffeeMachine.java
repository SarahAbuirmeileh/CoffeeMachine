package com.mycompany.coffeemachineproject;

import com.mycompany.coffeemachineproject.Exception.*;

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

    public void start() throws WastedTrayException, EmptyBeansException, EmptyWaterException {

        if (WasteTray.level == wasteTray.getCapacity()) {
            throw new WastedTrayException();
        }
        if (beans.getLevel() == 0) {
            throw new EmptyBeansException();
        }
        if (water.getLevel() == 0) {
            throw new EmptyWaterException();
        }
    }

    public void brewer(int coffeeChoice) throws WastedTrayException, OutOfBeansException, OutOfWaterException {

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
        WasteTray.level++;
    }
}
