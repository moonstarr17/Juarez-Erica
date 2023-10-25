import java.util.Scanner;

public class Student {

    private String first_name;
    private String middle_name;
    private String last_name;
    private String suffix;

    public Student(String first_name, String middle_name, String last_name, String suffix) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setFirstName(String fName) {
        this.first_name = fName;
    }

    public void setMiddleName(String mName) {
        this.middle_name = mName;
    }

    public void setLastName(String lName) {
        this.last_name = lName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return first_name + " " + middle_name + " " + last_name ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first_name = scan.nextLine();

        System.out.print("Enter middle name: ");
        String middle_name = scan.nextLine();

        System.out.print("Enter last name: ");
        String last_name = scan.nextLine();

        System.out.print("Enter suffix: ");
        String suffix = scan.nextLine();

        Student student = new Student(first_name, middle_name, last_name, suffix);

        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Full Name: " + student.getFullName());

        scan.close();
    }
}
