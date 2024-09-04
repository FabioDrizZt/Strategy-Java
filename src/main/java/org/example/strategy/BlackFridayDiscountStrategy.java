package org.example.strategy;

public class BlackFridayDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7; // 30% de descuento
    }
}
