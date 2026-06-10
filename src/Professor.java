public class Professor extends AcademicStaff{
    // Professor-specific attributes
    private String researchArea;
    private int publications;

    // Constructor
    public Professor(int memberId, String name,
                     double salary, String department,
                     String researchArea, int publications) {

        super(memberId, name, salary, department);

        this.researchArea = researchArea;
        this.publications = publications;
    }

    // Professor-specific method
    public void showResearchProfile() {
        System.out.println("Research Area: " + researchArea);
        System.out.println("Publications: " + publications);
    }

    // Override performDuty method
    @Override
    public void performDuty() {
        System.out.println(name +
                " conducts research and teaches advanced courses.");
    }
}
