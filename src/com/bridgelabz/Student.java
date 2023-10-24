package com.bridgelabz;

import java.util.Scanner;

public class Student {
    int age,id;
    String name;
    public void get(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id=sc.nextInt();
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Enter Age: ");
        age=sc.nextInt();

    }
    public void set(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }

    public static void main(String[] args) {
        System.out.println("******** Student Information ********");
    Student ob=new Student();
    ob.get();
    ob.set();
    }
}
