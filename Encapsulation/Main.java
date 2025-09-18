abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() {
        return 1.2 * 50000;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(int id, String name, double hourlyWage) {
        super(id, name, hourlyWage);
    }
    public double calculateSalary() {
        return 20 * 100;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class EmployeeDept implements Department {
    private String dept;
    public void assignDepartment(String dept) { this.dept = dept; }
    public String getDepartmentDetails() { return dept; }
}


abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price - calculateDiscount();
    }

    public String getName() {
        return name;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 500; }
    public double calculateTax() { return 0.18 * getPrice(); }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 200; }
    public double calculateTax() { return 0.05 * getPrice(); }
    public String getTaxDetails() { return "5% GST"; }
}

class Groceries extends Product {
    Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 50; }
}


abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getDetails() {
        return type + " " + vehicleNumber;
    }

    public double getRate() { return rentalRate; }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return days * getRate(); }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Car Insurance: 2000"; }
}

class Bike extends Vehicle implements Insurable {
    Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return days * getRate(); }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Bike Insurance: 500"; }
}


abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();

    public String getDetails() {
        return holderName + " Balance: " + balance + " Interest: " + calculateInterest();
    }
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return 0.04 * 10000; }
    public void applyForLoan() { System.out.println("Loan applied for Savings"); }
    public boolean calculateLoanEligibility() { return true; }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int num, String name, double bal) { super(num, name, bal); }
    public double calculateInterest() { return 0.02 * 10000; }
}


abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book reserved"); }
    public boolean checkAvailability() { return true; }
}


abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " " + price + " x " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return 200; }
    public double applyDiscount() { return 20; }
    public String getDiscountDetails() { return "Veg Discount 20"; }
}

class NonVegItem extends FoodItem {
    NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return 300; }
}


abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient: " + name + ", Age: " + age + ", Bill: " + calculateBill());
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    InPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 5000; }
    public void addRecord(String record) { System.out.println("Record added: " + record); }
    public void viewRecords() { System.out.println("Viewing records"); }
}

class OutPatient extends Patient {
    OutPatient(int id, String name, int age) { super(id, name, age); }
    public double calculateBill() { return 1000; }
}


abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " driving " + vehicleId + " earns " + calculateFare(10));
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class RideCar extends RideVehicle implements GPS {
    RideCar(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * 15; }
    public String getCurrentLocation() { return "City Center"; }
    public void updateLocation(String loc) { System.out.println("Location updated to " + loc); }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 200);
        e1.displayDetails();
        e2.displayDetails();

        Product p1 = new Electronics(1, "Laptop", 60000);
        System.out.println(p1.getName() + " Final Price: " + (p1.getPrice() + ((Taxable)p1).calculateTax()));

        Vehicle v1 = new Car("KA01", 1000);
        System.out.println(v1.getDetails() + " Rent: " + v1.calculateRentalCost(5));

        BankAccount acc1 = new SavingsAccount(1, "Nischal", 10000);
        System.out.println(acc1.getDetails());

        LibraryItem book = new Book(1, "Java", "James");
        book.getItemDetails();

        FoodItem food = new VegItem("Paneer", 100, 2);
        food.getItemDetails();

        Patient pat = new InPatient(1, "Sam", 30);
        pat.getPatientDetails();

        RideVehicle ride = new RideCar("CAR123", "Raj", 15);
        ride.getVehicleDetails();
    }
}
