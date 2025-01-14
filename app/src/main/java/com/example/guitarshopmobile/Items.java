package com.example.guitarshopmobile;

public class Items {
    int image;
    String description;
    String price;

    public Items(int image, String description, String price) {
        this.image = image;
        this.description = description;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
