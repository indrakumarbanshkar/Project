package project.employeePayrollSystem;

public class FullTimeEmployee extends Employee{

    private int monthlySalary;

    public FullTimeEmployee(String Name, int Id, int MonthlySalary) {
        super(Name, Id);
        this.monthlySalary=MonthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
