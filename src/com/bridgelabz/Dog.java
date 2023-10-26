package com.bridgelabz;

import java.util.Scanner;

public class Dog {
    int age;
    String breed;
    double weight;
    Scanner sc=new Scanner(System.in);
    public Dog(String b,double w){
        this.breed=b;
        this.weight=w;
    }
    public void dis(){
        System.out.println("Breed is: "+breed);
        System.out.println("Weight is: "+weight);
    }
    public void age(){
        int birthYear,PresentYear;
        System.out.println("*******Age Calculater******");
        System.out.println("Enter Birth Year Of Dog: ");
        birthYear=sc.nextInt();
        System.out.println("Enter Present Year: ");
        PresentYear=sc.nextInt();
        age=PresentYear-birthYear;
        System.out.println("Age of Dog is: "+age);
    }

    public static void main(String[] args) {
        Dog ob =new Dog("Shepered",50);
        ob.dis();
        ob.age();
    }
}
