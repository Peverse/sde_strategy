package com.hz;

import products.Product;

public class BlackFridayDiscount implements DiscountStrategy{

    private Customer customer;

    public BlackFridayDiscount(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {

        double discount = 0.00;

        discount += (0.10 * customer.getCart().size());

        return 1 - discount;
    }
}
