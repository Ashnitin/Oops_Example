package com.bridgelabz;

import java.util.Scanner;

public class CircelRadius {
    int r;
    double p=3.14,ar,cir;
    Scanner sc=new Scanner(System.in);

    public void area(){
        System.out.println("For Area Enter Radius : ");
        r=sc.nextInt();
        ar=p*r*r;
        System.out.println("Area is: "+ar);
    }
    public void circum(){
        System.out.println("For Circumference Enter Radius : ");
        r=sc.nextInt();
        cir=2*p*r;
        System.out.println("Circumference is: "+cir);
    }
    public static void main(String[] args) {
        CircelRadius ob=new CircelRadius();
        ob.area();
        ob.circum();
    }
}
