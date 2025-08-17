package com.upgrade.gcm.models;

abstract public class GroceryItem {
    private String name;
    private double pricePerKg;
    private double quantityKg;

    public GroceryItem(String name, double pricePerKg, double quantityKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.quantityKg = quantityKg;
    }
    // Getter and Setter for achieving Encapsulation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(double quantityKg) {
        this.quantityKg = quantityKg;
    }
    public abstract void displayDetails();
}
