package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class CookTop extends BuiltInAppliances{
    private String typeOfPanel;

    public CookTop(int price, Date lifetime, int embeddingDepth, String typeOfPanel) {
        super(price, lifetime, embeddingDepth);
        this.typeOfPanel = typeOfPanel;
    }

    public String getTypeOfPanel() {
        return typeOfPanel;
    }

    public void setTypeOfPanel(String typeOfPanel) {
        this.typeOfPanel = typeOfPanel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CookTop cookTop = (CookTop) o;
        return Objects.equals(typeOfPanel, cookTop.getTypeOfPanel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfPanel());
    }

    @Override
    public String toString() {
        return "CookTop{" +
                "typeOfPanel='" + typeOfPanel + '\'' +
                "} " + super.toString();
    }
}
