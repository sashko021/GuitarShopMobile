package com.example.guitarshopmobile;

import java.util.Objects;

public class CartItem {

    private Items product;
    private int quantity;

    public CartItem(Items product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Items getProduct() {
        return product;
    }

    public void setProduct(Items product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return getQuantity() == cartItem.getQuantity() && Objects.equals(getProduct(), cartItem.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getQuantity());
    }
}