import java.util.Scanner;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String fName, String mName, String lName, int a, String bDay, String addr) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.age = a;
        this.birthday = bDay;
        this.address = addr;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        while (true) {
            String inputFirstName = scanner.nextLine();
            if (inputFirstName.matches("^[a-zA-Z]*$")) {
                this.firstName = inputFirstName;
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid name without numbers.");
            }
        }

        System.out.print("Enter Middle Name: ");
        while (true) {
            String inputMiddleName = scanner.nextLine();
            if (inputMiddleName.matches("^[a-zA-Z]*$")) {
                this.middleName = inputMiddleName;
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid name without numbers.");
            }
        }

        System.out.print("Enter Last Name: ");
        while (true) {
            String inputLastName = scanner.nextLine();
            if (inputLastName.matches("^[a-zA-Z]*$")) {
                this.lastName = inputLastName;
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid name without numbers.");
            }
        }

        System.out.print("Enter Age: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int inputAge = scanner.nextInt();
                if (inputAge >= 0) {
                    this.age = inputAge;
                    break;
                } else {
                    System.out.println("Invalid input. Age cannot be negative. Please enter a valid age.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.print("Enter Birthday (YYYY-MM-DD): ");
        while (true) {
            String inputBirthday = scanner.nextLine();
            if (inputBirthday.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
                this.birthday = inputBirthday;
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid birthday in the format YYYY-MM-DD.");
            }
        }

        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Middle Name: " + getMiddleName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Address: " + getAddress());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        person.inputData();

        System.out.println("\nInformation Entered:");
        person.displayInfo();

        scanner.close();
    }
}
