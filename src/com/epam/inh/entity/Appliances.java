package com.epam.inh.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Appliances implements Serializable {
    private int price;
    private Date lifetime;

    public Appliances(int price, Date lifetime) {
        this.price = price;
        this.lifetime = lifetime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getLifetime() {
        return lifetime;
    }

    public void setLifetime(Date lifetime) {
        this.lifetime = lifetime;
    }

    public String info() {
        return "price: " + price + ", lifetime: " + lifetime;
    }


    @Override
    public String toString() {
        return "Appliances{" +
                "price=" + price +
                ", lifetime=" + lifetime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliances that = (Appliances) o;
        return price == that.price &&
                Objects.equals(lifetime, that.lifetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, lifetime);
    }
}
