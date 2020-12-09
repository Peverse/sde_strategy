package com.hz;

import products.Product;

public interface DiscountStrategy {
    double getDiscount(Product product, int index);
}
