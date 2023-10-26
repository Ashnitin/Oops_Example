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
        System.out.println("*******Age Calculater******");
        System.out.println("Enter Dog Age : ");
        age=sc.nextInt();
        if(age>0){
            if(age==1){
                System.out.println("Dogs Age in Human Year Is 15 Year ");
            } else if (age==2) {
                age=15+9;
                System.out.println("Dogs Age in Human Year is:"+age);
            }
            else{
                age=(age-2)*10+24;
                System.out.println("Dogs Age in human year is: "+age);
            }
        }
        else {
            System.out.println("Enter Valid Year");
        }
    }

    public static void main(String[] args) {
        Dog ob =new Dog("Shepered",50);
        ob.dis();
        ob.age();
    }
}
