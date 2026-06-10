//Academic staff class
public class AcademicStaff extends Employee{
    // Department of  academic staff
    protected String department;

    // Constructor
    public AcademicStaff(int memberId, String name,
                         double salary, String department) {
        super(memberId, name, salary);
        this.department = department;
    }

    // Display department information
    public void showDepartment() {
        System.out.println("Department: " + department);
    }

    // Override performDuty method
    @Override
    public void performDuty() {
        System.out.println(name +
                " teaches students in the " +
                department + " department.");
    }
}
