package project.carshowroom;

import java.util.Scanner;

public class Showroom implements Utility{
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_car_in_stock;
    String manager_name;


    @Override
    public void get_details(){
        System.out.println("Showroom Name :"+showroom_name);
        System.out.println("Showroom Address :"+showroom_address);
        System.out.println("Total Employee :"+total_employees);
        System.out.println("Total Car in Stock :"+total_car_in_stock);
        System.out.println("Manager Name :"+manager_name);
    };
    @Override
    public void set_details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("============================Enter Showroom details=======================");
        System.out.println();
        System.out.println(" SHOWROOM NAME ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address= sc.nextLine();
        System.out.println("Total No of Emplooyess");
        total_employees= sc.nextInt();
        System.out.println("Total No of car in Stock");
        total_car_in_stock = sc.nextInt();
        System.out.println("Manager Name");
        manager_name=sc.nextLine();

    };
}
