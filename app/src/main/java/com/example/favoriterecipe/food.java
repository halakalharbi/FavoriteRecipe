package com.example.favoriterecipe;

public class food {
    private String name; private String description; private int imageResourceId; private String [] recipt = new
            String[3];
    //Each Drink has a name, description, and an image resource
    public food(String name, String description, int imageResourceId , String [] recipt) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.recipt = recipt;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
    public String[] getRecipt(){
        return recipt;
    }
}

