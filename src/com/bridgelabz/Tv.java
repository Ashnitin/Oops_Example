package com.bridgelabz;

import java.util.Scanner;

public class Tv {
    String brand;
    int size;
    double price;

    public Tv(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    public void display(){
        System.out.println("Brand of TV: "+brand);
        System.out.println("size of TV: "+size);
        discount();
    }
    public void discount(){
        if(brand.equals("Samsung")){
            if (size==43){
                System.out.println("Price is 55000");
                System.out.println("Discount Available 40%");
                double discount=55000-(55000*40)/100;
                System.out.println("price after Discount is: "+discount);
            }
        } else if (brand.equals("Toshiba")) {
            if(size==43){
                System.out.println("Price is 30000");
                System.out.println("Discount Available 30%");
                double discount=30000-(30000*30)/100;
                System.out.println("price after Discount is: "+discount);
            }
        }
        else {
            System.out.println("Not Available");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Brand: ");
        String brand=sc.next();
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        Tv ob=new Tv(brand,size);
        ob.display();
    }
}
