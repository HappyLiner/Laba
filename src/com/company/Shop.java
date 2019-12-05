package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {
    private String name;
    private ArrayList<Product> products;
    private int cost;
    private int max_weight = 0;
    

    /**
     *
     * Reading all products until word "Break"
     * @return nothing
     */
    public void readAll(){
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([a-zA-Z0-9]+); *([0-9]+); *([0-9]+); *([0-9]+) *");
        String str = "";
        Boolean halt = false;
        while(!str.toLowerCase().equals("break")) {
            System.out.println("Enter new product in format: Product Name; Weight; Cost; Count. Or enter \"Break\" to stop adding");
            str = in.nextLine();
            if(str.toLowerCase().equals("break"))
                halt = true;
            if(!halt) {
                while (!inputCheck(str)) {
                    System.out.println("Wrong Data! Please, try again.");
                    str = in.nextLine();
                }
                Matcher m = pattern.matcher(str);
                m.find();
                Product product = new Product(m.group(1), Integer.parseInt(m.group(2)), Integer.parseInt(m.group(3)), Integer.parseInt(m.group(4)));
                this.addProduct(product);
                System.out.println("Product has been added!");
            }
        }
    }

    private static boolean inputCheck (String str) {
        return Pattern.matches("([a-zA-Z0-9]+); *([0-9]+); *([0-9]+); *([0-9]+) *", str);
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
 }
