package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person {
    private static int nextCustomerId = 0;
    private int customerId;
    private ArrayList<Product> checkoutCart = new ArrayList<Product>();

    public Customer(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        this.customerId = nextCustomerId;
        ++nextCustomerId;
    }

    public ArrayList<Product> getCheckoutCart() {
        return checkoutCart;
    }

    public void setCheckoutCart(ArrayList<Product> checkoutCart) {
        this.checkoutCart = checkoutCart;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    @Override
    public void introducePerson() {
        System.out.println(this.customerId + ", " + this.getName() + ", " + this.getDateOfBirth());
    }
}
