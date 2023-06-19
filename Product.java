package com.techlabs.Shoping;

public class Product {
	private int id;
    private String name;
    private double price;
    private double discountPrice;

    public Product(int id, String name, double price, double discountPrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountPrice;
    }

    public void setDiscountedPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
    public double calculateDiscountedPrice() {
        return price - discountPrice;
    }

}
