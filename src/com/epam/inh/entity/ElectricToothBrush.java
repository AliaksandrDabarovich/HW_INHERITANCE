package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class ElectricToothBrush extends BodyCareAppliances{
    private boolean waterProofness;

    public ElectricToothBrush(int price, Date lifetime, String bodyMaterial, boolean waterProofness) {
        super(price, lifetime, bodyMaterial);
        this.waterProofness = waterProofness;
    }

    public boolean isWaterProofness() {
        return waterProofness;
    }

    public void setWaterProofness(boolean waterProofness) {
        this.waterProofness = waterProofness;
    }

    @Override
    public String info() {
        return "price: " + super.getPrice() + ", lifetime: " + super.getLifetime() + ", waterProofness: " + waterProofness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricToothBrush)) return false;
        if (!super.equals(o)) return false;
        ElectricToothBrush that = (ElectricToothBrush) o;
        return isWaterProofness() == that.isWaterProofness();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWaterProofness());
    }

    @Override
    public String toString() {
        return "ElectricToothBrush{" +
                "waterProofness=" + waterProofness +
                "} " + super.toString();
    }
}
