package project.atm;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN =1234 ;
    ATM (int PIN){
        System.out.println("Enter your pin ...");
        Scanner scan = new Scanner(System.in);
        int enteredpin= scan.nextInt();
        if(enteredpin==PIN){
            menu();
        }else {
            System.out.println("Please enter valid pin....");
        }
    }
    private void menu() {
        System.out.println("Enter your Choice.....");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();
        } else if (opt==3) {
            depositMoney();
        }else if(opt==4){
            return;
        }else{
            System.out.println("Please enter valid choice...");
        }

    }

    private void depositMoney() {
        System.out.println("Enter money to deposit..");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance= amount + Balance;
        System.out.println("Amount deposited successfully");
        menu();
    }


    public void checkBalance(){
        System.out.println("Your Balance is "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amout to withdraw.." );
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Amount");
        }else{
            Balance= Balance- amount;
            System.out.println("Money withdrawl successfull");
        }
         menu();
    }
}
