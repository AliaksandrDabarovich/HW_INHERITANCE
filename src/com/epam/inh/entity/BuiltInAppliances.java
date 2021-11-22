package com.epam.inh.entity;

import java.util.Date;
import java.util.Objects;

public class BuiltInAppliances extends Appliances{
    private int embeddingDepth;

    public BuiltInAppliances(int price, Date lifetime, int embeddingDepth) {
        super(price, lifetime);
        this.embeddingDepth = embeddingDepth;
    }

    public int getEmbeddingDepth() {
        return embeddingDepth;
    }

    public void setEmbeddingDepth(int embeddingDepth) {
        this.embeddingDepth = embeddingDepth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BuiltInAppliances that = (BuiltInAppliances) o;
        return embeddingDepth == that.getEmbeddingDepth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmbeddingDepth());
    }

    @Override
    public String toString() {
        return "BuiltInAppliances{" +
                "embeddingDepth=" + embeddingDepth +
                "} " + super.toString();
    }
}
