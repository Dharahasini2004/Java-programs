import java.util.*;

// Interface for father details
interface Father {
    void getFatherDetails(Scanner sc);
    void showFatherDetails();
}

// Interface for mother details
interface Mother {
    void getMotherDetails(Scanner sc);
    void showMotherDetails();
}

// Child class implementing both interfaces
class Child implements Father, Mother {
    private String fatherName, motherName, childName;
    private int fatherAge, motherAge, childAge;
    private String fatherJob, motherJob, childHobby;

    public void getFatherDetails(Scanner sc) {
        System.out.print("Enter father's name: ");
        fatherName = sc.nextLine();
        System.out.print("Enter father's age: ");
        fatherAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter father's job: ");
        fatherJob = sc.nextLine();
    }

    public void showFatherDetails() {
        System.out.println("Father: " + fatherName + " | Age: " + fatherAge + " | Job: " + fatherJob);
    }

    public void getMotherDetails(Scanner sc) {
        System.out.print("Enter mother's name: ");
        motherName = sc.nextLine();
        System.out.print("Enter mother's age: ");
        motherAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter mother's job: ");
        motherJob = sc.nextLine();
    }

    public void showMotherDetails() {
        System.out.println("Mother: " + motherName + " | Age: " + motherAge + " | Job: " + motherJob);
    }

    public void getChildDetails(Scanner sc) {
        System.out.print("Enter child's name: ");
        childName = sc.nextLine();
        System.out.print("Enter child's age: ");
        childAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter child's hobby: ");
        childHobby = sc.nextLine();
    }

    public void showChildDetails() {
        System.out.println("Child: " + childName + " | Age: " + childAge + " | Hobby: " + childHobby);
    }
}

// Main class
public class Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Child c = new Child();

        System.out.println("\n-----Enter Father's Details-----");
        c.getFatherDetails(sc);

        System.out.println("\n-----Enter Mother's Details-----");
        c.getMotherDetails(sc);

        System.out.println("\n-----Enter Child's Details-----");
        c.getChildDetails(sc);

        System.out.println("\n-----Family Details-----");
        c.showFatherDetails();
        c.showMotherDetails();
        c.showChildDetails();

        sc.close();
    }
}
