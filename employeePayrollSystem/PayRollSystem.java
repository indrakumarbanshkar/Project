package project.employeePayrollSystem;

import org.apache.poi.util.SystemOutLogger;

import java.util.ArrayList;

public class PayRollSystem {
    private ArrayList<Employee> employeelist;
    public PayRollSystem(){
        employeelist= new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for (Employee emp:employeelist) {
            if(emp.getId()==id){
                employeeToRemove=emp;
                break;
            }
        }
        if(employeeToRemove != null){
            employeelist.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for (Employee emp1:employeelist){
            System.out.println(emp1);
        }
    }


}
