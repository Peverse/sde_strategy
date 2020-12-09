package com.hz;

public class Checkout {

    public void nextInLine(Customer customer, String day) {

        DiscountStrategy discountStrategy;

        // init checkout
        if(day == "Christmas"){
            discountStrategy = new ChristmasDiscount(customer);
        }
        else if(day == "Black Friday"){
            discountStrategy = new BlackFridayDiscount(customer);
        }
        else {
            discountStrategy = new DefaultDiscount(customer);
        }

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
