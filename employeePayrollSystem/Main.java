package project.employeePayrollSystem;

public class Main {

    public static void main(String[] args) {
        PayRollSystem payrollsyatem= new PayRollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee("Indra",100,2000);
        PartTimeEmployee emp2= new PartTimeEmployee("mohan",101,7,200);
        payrollsyatem.addEmployee(emp1);
        payrollsyatem.addEmployee(emp2);
        System.out.println("all employee details");
        payrollsyatem.displayEmployees();
        payrollsyatem.removeEmployee(101);
        System.out.println("all employee detailsn after removing");
        payrollsyatem.displayEmployees();
    }
}
