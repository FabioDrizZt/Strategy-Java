package org.example;
import org.example.strategy.BlackFridayDiscountStrategy;
import org.example.strategy.SeasonalDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.00);

        // Sin descuento
        product.displayPrice();

        // Aplicando descuento estacional
        product.setDiscountStrategy(new SeasonalDiscountStrategy());
        product.displayPrice();

        // Aplicando descuento de Black Friday
        product.setDiscountStrategy(new BlackFridayDiscountStrategy());
        product.displayPrice();
    }
}