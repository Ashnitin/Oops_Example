package com.bridgelabz;

import java.util.Scanner;

public class Shirt {
    String size; //l,m,s,xs,xl
    String color;

    public Shirt(String size, String color) {
        this.size = size;
        this.color = color;
    }
    public void display(){
        System.out.println("Enter Shirt Size : "+size);
        System.out.println("Enter Color: "+color);
        price();
    }
    public void price(){
        if (color.equals("black")){
            discount();
        } else if (color.equals("white")) {
            discount();
        } else if (color.equals("red")) {
            discount();
        }

    }
    public void discount(){
        if (size.equals("S")){
            int price = 2000, dic = 10;
            System.out.println("Price is " + price);
            System.out.println("Discount Available "+dic+"%");
            double d = 100 - dic;
            double discount = (price * d) / 100;
            System.out.println("price after Discount is: " + discount);
        } else if (size.equals("M")) {
            int price = 3000, dic = 20;
            System.out.println("Price is " + price);
            System.out.println("Discount Available "+dic+"%");
            double d = 100 - dic;
            double discount = (price * d) / 100;
            System.out.println("price after Discount is: " + discount);
        } else if (size.equals("L")) {
            int price = 1500, dic = 5;
            System.out.println("Price is " + price);
            System.out.println("Discount Available "+dic+"%");
            double d = 100 - dic;
            double discount = (price * d) / 100;
            System.out.println("price after Discount is: " + discount);
        }else {
            System.out.println("**********Discount not Available******");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        String size=sc.next();
        System.out.println("Enter color: ");
        String color=sc.next();

        Shirt ob=new Shirt(size,color);
        ob.display();
    }
}
