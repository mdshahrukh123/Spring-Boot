package com.geekster.ecommerce.models;

public class Product {

    private int productId;
    private String productName;
    private String price;
    //todo use  - ENUM instead of String...to get fixed types of category...your choice !!
    private String description;
    private String category;
    private String brand;

    //todo
    //what happens when no setters in general : json to java object convert issues or not ?? Deserializable


    public Product(int productId, String productName, String price, String description, String category, String brand) {
        System.out.println("product constructor is called!!!");

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.brand = brand;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
