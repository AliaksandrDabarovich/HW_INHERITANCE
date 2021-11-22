package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class CleaningAppliances extends Appliances{
    private int power;

    public CleaningAppliances(int price, Date lifetime, int power) {
        super(price, lifetime);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CleaningAppliances)) return false;
        if (!super.equals(o)) return false;
        CleaningAppliances that = (CleaningAppliances) o;
        return getPower() == that.getPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPower());
    }

    @Override
    public String toString() {
        return "CleaningAppliances{" +
                "power=" + power +
                "} " + super.toString();
    }
}
