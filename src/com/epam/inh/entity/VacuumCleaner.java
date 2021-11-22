package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class VacuumCleaner extends CleaningAppliances{
    private int numberOfAttachment;

    public VacuumCleaner(int price, Date lifetime, int power, int numberOfAttachment) {
        super(price, lifetime, power);
        this.numberOfAttachment = numberOfAttachment;
    }

    public int getNumberOfAttachment() {
        return numberOfAttachment;
    }

    public void setNumberOfAttachment(int numberOfAttachment) {
        this.numberOfAttachment = numberOfAttachment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return getNumberOfAttachment() == that.getNumberOfAttachment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfAttachment());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "numberOfAttachment=" + numberOfAttachment +
                "} " + super.toString();
    }
}
