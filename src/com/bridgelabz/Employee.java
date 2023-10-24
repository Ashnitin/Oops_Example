package com.bridgelabz;

import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double salary,yearlySalary;
public void get(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Id: ");
    id=sc.nextInt();
    System.out.println("Enter Name: ");
    name=sc.next();
    System.out.println("Enter salary: ");
    salary=sc.nextInt();
}
    public void salCal(){
        yearlySalary=12*salary;
    }
    public void set(){
        System.out.println("Employee Name is: "+name+"\n");
        System.out.println("Emplyee Yearly Salary is: "+yearlySalary);
    }

    public static void main(String[] args) {
        System.out.println("************ Employee Information ****************");
        Employee em=new Employee();
        em.get();
        em.salCal();
        em.set();
    }
}
