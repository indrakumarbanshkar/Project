package project.carshowroom;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;


    public void get_details(){
        System.out.println("Employee Id :"+emp_id);
        System.out.println("Employee Name:"+emp_name);
        System.out.println("Employee age :"+emp_age);
        System.out.println("Employee department:"+emp_department);
        System.out.println("Showroom Name :"+showroom_name);
    };
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();

    };
}
