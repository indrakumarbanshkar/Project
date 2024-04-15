package project.employeePayrollSystem;

abstract class Employee {
    private String name;
    private int id;
    public Employee(String Name, int Id){
        this.name=Name;
        this.id= Id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

  public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee [ name " +name+" , id  "+id+ " , Salary  "+calculateSalary() +"]";
    }


}
