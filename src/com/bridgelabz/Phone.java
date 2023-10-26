package com.bridgelabz;

import java.util.Scanner;

public class Phone {
    String make;
    String model;
    double storage;


    Phone(String make, String model, int storage){
        this.make= make;
        this.model= model;
        this.storage= storage;
    }
    public void display(){
        System.out.println("Company of mobile: "+make);
        System.out.println("Model of mobile: "+model);
        System.out.println("Storage of mobile: "+storage);
        price();
    }
    public void price(){
        if (make.equals("iphone")){
            if (model.equals("iphone13"))  {
                if(storage==128){
                    System.out.println("Price is 59999");
                }
            }
        } else if (make.equals("Samsung")) {
            if(model.equals("F345")){
                if(storage==65){
                    System.out.println("Price is 18499 ");
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company: ");
        String make=sc.next();
        System.out.println("Enter model: ");
        String model=sc.next();
        System.out.println("Enter Storage: ");
        int storage=sc.nextInt();

        Phone ob=new Phone(make,model,storage);
        ob.display();

    }
}
