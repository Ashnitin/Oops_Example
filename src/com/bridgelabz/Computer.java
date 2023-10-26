package com.bridgelabz;

import java.awt.*;
import java.util.Scanner;

public class Computer {
    String Processor;
    double storage;
    double Ram;

    public Computer(String processor, double storage, double ram) {
        Processor = processor;
        this.storage = storage;
        Ram = ram;
    }
    public  void dis(){
        System.out.println("Processor is : "+Processor);
        System.out.println("Storage is : "+storage);
        System.out.println("RAM is : "+ Ram);
        price();
    }
    public void price(){
        if (Processor.equals("intel")){
            if (storage==64)  {
                if(Ram==4){
                    System.out.println("Price is 25000");
                }
            }
        } else if (Processor.equals("AppleM2")) {
            if(storage==256){
                if(Ram==8){
                    System.out.println("Price is 90000 ");
                }
            }
        }
        else {
            System.out.println("Not Available");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Processor: ");
        String Processor=sc.next();
        System.out.println("Enter Storage: ");
        double storage=sc.nextDouble();
        System.out.println("Enter RAM: ");
        double Ram=sc.nextDouble();

            Computer ob=new Computer(Processor,storage,Ram);
            ob.dis();
    }
}
