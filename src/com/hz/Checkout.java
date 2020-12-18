package com.hz;

public class Checkout {

    private DiscountStrategy discountStrategy;

    public void setDiscount(DiscountStrategy discount){
        this.discountStrategy = discount;
    }

    public void nextInLine(Customer customer) {

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountStrategy);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
