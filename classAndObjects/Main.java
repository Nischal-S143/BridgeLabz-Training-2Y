public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", 299.99);
        System.out.println(b1.title + " " + b1.author + " " + b1.price);

        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        System.out.println("Circle radius: " + c1.radius + ", " + c2.radius);

        Person p1 = new Person("Alex", 21);
        Person p2 = new Person(p1);
        System.out.println(p1.name + " " + p1.age + " | " + p2.name + " " + p2.age);

        HotelBooking hb1 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking hb2 = new HotelBooking(hb1);
        System.out.println(hb1.guestName + " " + hb1.roomType + " " + hb1.nights);

        LibraryBook lb1 = new LibraryBook("C++", "Bjarne", 400, true);
        lb1.borrowBook();
        System.out.println(lb1.title + " available: " + lb1.availability);

        CarRental cr1 = new CarRental("Mike", "SUV", 5);
        System.out.println("Total Cost: " + cr1.calculateTotalCost(1000));

        Product pdt1 = new Product("Laptop", 55000);
        Product pdt2 = new Product("Phone", 20000);
        pdt1.displayProductDetails();
        Product.displayTotalProducts();

        Course.updateInstituteName("GLA University");
        Course cse = new Course("Java", 6, 5000);
        cse.displayCourseDetails();

        Vehicle v1 = new Vehicle("Ramesh", "Bike");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);

        Student s1 = new Student(101, "Arjun", 8.5);
        PostgraduateStudent pg = new PostgraduateStudent(102, "Rahul", 9.0);
        System.out.println(s1.rollNumber + " " + s1.name + " " + s1.getCGPA());
        pg.showName();

        BookLibrary bl1 = new BookLibrary("123-456", "OOP Concepts", "Smith");
        EBook eb1 = new EBook("789-111", "Advanced Java", "Rob");
        System.out.println(bl1.getAuthor());
        eb1.displayInfo();

        SavingsAccount sa1 = new SavingsAccount(1001, "Neha", 5000);
        System.out.println("Balance: " + sa1.getBalance());
        sa1.showDetails();

        Manager m1 = new Manager(201, "IT", 80000);
        System.out.println("Salary: " + m1.getSalary());
        m1.showInfo();
    }
}

// Level 1 Practice Programs
class Book {
    String title, author;
    double price;

    Book() {
        this("Unknown", "Unknown", 0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}

class HotelBooking {
    String guestName, roomType;
    int nights;

    HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}

class LibraryBook {
    String title, author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
        }
    }
}

class CarRental {
    String customerName, carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost(double ratePerDay) {
        return rentalDays * ratePerDay;
    }
}

// Instance vs Class Variables
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " - " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName;

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " - " + duration + " months - " + fee + " | " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

class Vehicle {
    String ownerName, vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " - " + vehicleType + " Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

// Access Modifiers
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void showName() {
        System.out.println(name);
    }
}

class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;

    BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookLibrary {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayInfo() {
        System.out.println(ISBN + " - " + title);
    }
}

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void showDetails() {
        System.out.println(accountNumber + " - " + accountHolder);
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void showInfo() {
        System.out.println(employeeID + " - " + department);
    }
}
