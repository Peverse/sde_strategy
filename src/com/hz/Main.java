package com.hz;

import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
        Checkout kassa5 = new Checkout();

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");
        Customer ruud = new Customer(CustomerType.New, "Ruud");

        // buying stuff
        piet.buys(new CuteTeddyBear());
        anne.buys(new CuteTeddyBear());
        ruud.buys(new CuteTeddyBear());
        ruud.buys(new CuteTeddyBear());

        // and proceed to checkout
        kassa5.nextInLine(piet, "Christmas");
        kassa5.nextInLine(anne, "Regular");
        kassa5.nextInLine(ruud, "Black Friday");
    }
}
