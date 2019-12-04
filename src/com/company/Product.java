package com.company;

public class Product {
    private String name;
    private int weight;
    private int cost;
    private int count;

    Product () {}

    Product (String name, int weight, int cost, int count){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
