//Abstract class for University Members
abstract public class UniversityMember {
//    Common attributes
    protected int memberId;
    protected String name;
// Constructor
    public UniversityMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
//Display basic member information
    public void displayBasicInfo() {
        System.out.println("ID: " + memberId);
        System.out.println("Name: " + name);
    }
// Abstract method performDuty
    public abstract void performDuty();
}
