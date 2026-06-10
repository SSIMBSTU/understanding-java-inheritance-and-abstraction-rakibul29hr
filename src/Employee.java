
//Employee Class
public class Employee extends UniversityMember{
//    Attribute
    protected double salary;
//  Constructor for Employee
    public Employee(int memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }
//    Dislay employee salary
    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
// Override perform Duty method
    @Override
    public void performDuty() {
        System.out.println(name + " performs general employee duties.");
    }
}

