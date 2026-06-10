import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList of superclass references
        // Used to demonstrate runtime polymorphism
        ArrayList<UniversityMember> members = new ArrayList<>();

        // Creating a Professor object
        Professor p1 = new Professor(
                101,
                "Dr. Ziaur Rahman",
                80000,
                "ICT",
                "OOP pattern",
                15
        );

        // Creating an Administrative Officer object
        Administrativeofficer a1 = new Administrativeofficer(
                201,
                "Mr. Kamal",
                40000,
                "Administration Office"
        );

        // Adding object
        members.add(p1);
        members.add(a1);


        for (UniversityMember member : members) {

            member.displayBasicInfo();

            // Runtime Polymorphism:
            // Correct performDuty() is selected at runtime
            member.performDuty();

        }



        for (UniversityMember member : members) {


            if (member instanceof Professor) {

                // Safe downcasting
                Professor p = (Professor) member;

                System.out.println("Professor Information:");

                p.displayBasicInfo();

                // Accessing Professor-specific method
                p.showResearchProfile();
            }
        }
    }
}