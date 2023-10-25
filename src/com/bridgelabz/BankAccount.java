package com.bridgelabz;

import java.util.Scanner;

public class BankAccount {
    int AccountNo=12345;
    double balance=10000;
    Scanner sc= new Scanner(System.in);
    public void deposit(){
        System.out.println("Enter Account No : ");
        int a=sc.nextInt();
            if(AccountNo==a){
                System.out.println("Enter The Amount for deposit: ");
                int amt= sc.nextInt();
                System.out.println("++++++++++++Amount Deposited Successfully+++++++++++++++");
                System.out.println("Your Balance is: "+(balance+amt));
            }
            else
            {
                System.out.println("Please Enter Correct Bank Account Number");
            }
    }
    public void withdraw(){
        System.out.println("Enter Account No : ");
        int a=sc.nextInt();
        if(AccountNo==a){
            System.out.println("Enter The Amount for withdraw: ");
            int amt=sc.nextInt();
            if (balance<amt){
                System.out.println("Insufficient balance for withdraw");
            }
            else {
                double remaining_amt = balance - amt;
                System.out.println("Your Remaining Balance is: " + remaining_amt);
            }
        }
        else
        {
            System.out.println("Please Enter Correct Bank Account Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BankAccount ob =new BankAccount();
        System.out.println("***********Welcome to our Bank***********");
        System.out.println("Enter Your Choice :\n1)Deposit\n2)Withdraw");
        int ch=sc.nextInt();
        switch (ch){
            case 1:ob.deposit();
                break;
            case 2:ob.withdraw();
                break;
        }
    }
}
