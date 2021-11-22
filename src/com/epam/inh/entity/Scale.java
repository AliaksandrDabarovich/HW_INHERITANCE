package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class Scale extends BodyCareAppliances{
    private int maxWage;

    public Scale(int price, Date lifetime, String bodyMaterial, int maxWage) {
        super(price, lifetime, bodyMaterial);
        this.maxWage = maxWage;
    }

    public int getMaxWage() {
        return maxWage;
    }

    public void setMaxWage(int maxWage) {
        this.maxWage = maxWage;
    }

    @Override
    public String info() {
        return "price: " + super.getPrice() + ", lifetime: " + super.getLifetime() + ", maxWage: " + maxWage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scale)) return false;
        if (!super.equals(o)) return false;
        Scale scale = (Scale) o;
        return getMaxWage() == scale.getMaxWage();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaxWage());
    }

    @Override
    public String toString() {
        return "Scale{" +
                "maxWage=" + maxWage +
                "} " + super.toString();
    }
}
