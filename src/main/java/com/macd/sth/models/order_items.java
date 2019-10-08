package com.macd.sth.models;

public class order_items {

    private int id, quantity, amount;

    public order_items(int id, int quantity, int amount) {
        this.id = id;
        this.quantity = quantity;
        this.amount = amount;
    }

    private order_items(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
