package com.example.guitarshopmobile;

public class Items {
    String id;
    String name;
    int price;
    int imgUrl;

    public Items(String id, int imgUrl, int price, String name) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    /*int image;
//    String description;
    String price;

    public Items(int image,*//* String description,*//* String price) {
        this.image = image;
//        this.description = description;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    *//*public String getDescription() {
        return description;
    }*//*

    public String getPrice() {
        return price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    *//*public void setDescription(String description) {
        this.description = description;
    }*//*

    public void setPrice(String price) {
        this.price = price;
    }*/
}
