package com.company;

public class Main {

    public static void main(String[] args) {
	    Warehouse wh1 = new Warehouse();
	    wh1.readOne();
	    wh1.readOne();
        wh1.readOne();
	    System.out.println(wh1.showInfo());
        Warehouse wh2 = new Warehouse();
        wh2.readAll();
        System.out.println(wh2.showInfo());
    }
}
