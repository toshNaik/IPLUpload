package com.example.loginapplication;

public class Player {
    //TODO: add image player face (image) attribute to this class
    private String Name, Type, ImageUri;
    private int Price, Rating;
    private boolean Uncapped;

    public Player() {
    }

    public Player(String name, String type, String imageUri, int price, int rating, boolean uncapped) {
        Name = name;
        Type = type;
        ImageUri = imageUri;
        Price = price;
        Rating = rating;
        Uncapped = uncapped;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public boolean isUncapped() {
        return Uncapped;
    }

    public void setUncapped(boolean uncapped) {
        Uncapped = uncapped;
    }
}
