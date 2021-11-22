package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class BodyCareAppliances extends Appliances{
    private String bodyMaterial;

    public BodyCareAppliances(int price, Date lifetime, String bodyMaterial) {
        super(price, lifetime);
        this.bodyMaterial = bodyMaterial;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BodyCareAppliances)) return false;
        if (!super.equals(o)) return false;
        BodyCareAppliances that = (BodyCareAppliances) o;
        return Objects.equals(getBodyMaterial(), that.getBodyMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBodyMaterial());
    }

    @Override
    public String toString() {
        return "BodyCareAppliances{" +
                "bodyMaterial='" + bodyMaterial + '\'' +
                "} " + super.toString();
    }
}
