package project.employeePayrollSystem;

public class PartTimeEmployee extends Employee{

    private int howrsworked;
    private double hourlyrate;

    public PartTimeEmployee(String Name, int Id, int howrsworked, int hourlyrate) {
        super(Name, Id);
        this.hourlyrate=howrsworked;
        this.howrsworked=hourlyrate;

    }

    @Override
    public double calculateSalary() {
        return howrsworked* hourlyrate ;
    }
}
