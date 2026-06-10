public class Administrativeofficer  extends Employee{
    // Office information
    private String office;

    // Constructor
    public Administrativeofficer(int memberId, String name,
                                 double salary, String office) {

        super(memberId, name, salary);
        this.office = office;
    }

    // Display office information
    public void showOffice() {
        System.out.println("Office: " + office);
    }

    // Override performDuty method
    @Override
    public void performDuty() {
        System.out.println(name +
                " manages administrative activities.");
    }
}
