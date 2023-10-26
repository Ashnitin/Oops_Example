package com.bridgelabz;

import java.util.Scanner;

public class Furniture {
    String type;
    String material;
    double price;

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }
    public void display(){
        System.out.println("Type of Furniture : "+type);
        System.out.println("Material of Furniture: "+material);
        price();
    }
    public void price() {
        if (type.equals("sofa")) {
            if (material.equals("wood")) {
                int price = 30000, dic = 10;
                System.out.println("Price is " + price);
                System.out.println("Discount Available 10%");
                double d = 100 - dic;
                double discount = (price * d) / 100;
                System.out.println("price after Discount is: " + discount);
            }
        } else if (type.equals("chair")) {
            if (material.equals("Hardboard")) {
                int price = 10000, dic = 5;
                System.out.println("Price is " + price);
                System.out.println("Discount Available 5%");
                double d = 100 - dic;
                double discount = (price * d) / 100;
                System.out.println("price after Discount is: " + discount);
            }
        }else {
            System.out.println("Not Available");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Type: ");
        String type=sc.next();
        System.out.println("Enter material: ");
        String material=sc.next();
        Furniture ob=new Furniture(type,material);
        ob.display();
    }
}
