package com.example.guitarshopmobile;

public class CartContent {
    private int id;
    private String name;
    private float price;
    private int quantity;

    public CartContent(int id, String name, float price, int quantity) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public CartContent() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public float getPrice() {
        return id;
    }
    public void setPrice(float price) {
        this.price=price;
    }
    public int getQuantity() {
        return id;
    }
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
}

