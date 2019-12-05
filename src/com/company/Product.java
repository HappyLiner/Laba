package com.company;

public class Product {
    private String name;
    private int weight;
    private int cost;
    private int count;
    private int material;
    private int color;

    Product () {
        this.name = "";
        this.weight = 0;
        this.cost = 0;
        this.count = 0;
    }

    Product (String name, int weight, int cost, int count){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.count = count;
    }

    /**
     *
     * Setters and Getters
     *
     */
    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }
}
