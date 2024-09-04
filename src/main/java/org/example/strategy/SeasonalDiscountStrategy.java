package org.example.strategy;

public class SeasonalDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% de descuento
    }
}
