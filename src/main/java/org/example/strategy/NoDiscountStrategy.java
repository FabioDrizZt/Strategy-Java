package org.example.strategy;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // No se aplica ningún descuento
    }
}
