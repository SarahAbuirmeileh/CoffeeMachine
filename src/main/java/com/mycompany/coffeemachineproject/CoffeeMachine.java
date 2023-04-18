package com.mycompany.coffeemachineProject;

/**
 *
 * @author ساره
 */
public class CoffeeMachine {
    private WaterCntainer water;
    private BeansContainer beans;
    private Grind grind;
    private WasteTray wasteTray;
    private Logger logger;

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

}
