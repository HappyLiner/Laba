package com.company;

import java.util.ArrayList;

public class Truck {
    private ArrayList<Product> products;
    private int max_weight;

    Truck () {
        this.products = new ArrayList<Product>();
        this.max_weight = 0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setMax_weight(int max_weight) {
        this.max_weight = max_weight;
    }


}
