package org.example;

import org.example.strategy.DiscountStrategy;
import org.example.strategy.NoDiscountStrategy;

public class Product {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discountStrategy = new NoDiscountStrategy(); // Estrategia por defecto
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getPriceWithDiscount() {
        return discountStrategy.applyDiscount(price);
    }

    public void displayPrice() {
        System.out.println(name + ": Precio final con descuento: $" + getPriceWithDiscount());
    }

}
