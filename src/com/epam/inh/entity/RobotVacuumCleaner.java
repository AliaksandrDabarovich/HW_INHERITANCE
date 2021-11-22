package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class RobotVacuumCleaner extends CleaningAppliances{
    private int batteryLife;

    public RobotVacuumCleaner(int price, Date lifetime, int power, int batteryLife) {
        super(price, lifetime, power);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RobotVacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        RobotVacuumCleaner that = (RobotVacuumCleaner) o;
        return getBatteryLife() == that.getBatteryLife();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatteryLife());
    }

    @Override
    public String toString() {
        return "RobotVacuumCleaner{" +
                "batteryLife=" + batteryLife +
                "} " + super.toString();
    }
}
