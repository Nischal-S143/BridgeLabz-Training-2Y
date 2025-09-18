// Problem 1: Bank Account Classes
class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Problem 2 & 3: Person, Worker, and School/Restaurant Roles
class Person {
    String name;
    int age;
    int id; // Used for restaurant, can be ignored for school

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    public Staff(String name, int age) {
        super(name, age);
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking delicious food.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is taking orders and serving tables.");
    }
}


// Problem 4: Vehicle Classes
class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is now charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}


// Main class to run all demonstrations
public class AllInOneCode {
    public static void main(String[] args) {
        // --- Bank Account System ---
        System.out.println("## 1. Bank Account System ##");
        SavingsAccount mySavings = new SavingsAccount("SA-123", 5000.0, 2.5);
        CheckingAccount myChecking = new CheckingAccount("CA-456", 2500.0, 1000.0);
        FixedDepositAccount myFd = new FixedDepositAccount("FD-789", 10000.0);

        mySavings.displayAccountType();
        System.out.println("---");
        myChecking.displayAccountType();
        System.out.println("---");
        myFd.displayAccountType();
        System.out.println("\n====================================\n");

        // --- School System ---
        System.out.println("## 2. School System ##");
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");
        Student student = new Student("Alice", 15, "10th");
        Staff staff = new Staff("John Doe", 35);

        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        student.displayInfo();
        student.displayRole();
        System.out.println();

        staff.displayInfo();
        staff.displayRole();
        System.out.println("\n====================================\n");

        // --- Restaurant System ---
        System.out.println("## 3. Restaurant Management System ##");
        Chef chef = new Chef("Gordon", 101);
        Waiter waiter = new Waiter("Mia", 102);
        
        chef.performDuties();
        waiter.performDuties();
        System.out.println("\n====================================\n");
        
        // --- Vehicle System ---
        System.out.println("## 4. Vehicle Management System ##");
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220);

        System.out.println("Electric Vehicle:");
        tesla.charge();

        System.out.println("\nPetrol Vehicle:");
        honda.refuel();
    }
}