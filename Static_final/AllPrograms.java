class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber + ", Balance: " + balance);
        }
    }
}

class LibraryBook {
    private static String libraryName = "City Library";
    String title;
    String author;
    final String isbn;

    LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof LibraryBook) {
            System.out.println("Book: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

class Employee {
    private static String companyName = "BridgeLabz";
    private static int totalEmployees = 0;
    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Designation: " + designation);
        }
    }
}

class Product {
    private static double discount = 10.0;
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        double totalPrice = (price * quantity) * (1 - discount / 100);
        System.out.println("Product: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Discount: " + discount + "%, Total: " + totalPrice);
    }
}

class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    String name;
    final int rollNumber;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
        }
    }
}

public class AllPrograms {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Nischal", 101, 5000);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();

        LibraryBook b1 = new LibraryBook("Java Programming", "James Gosling", "ISBN12345");
        b1.displayBookDetails();
        LibraryBook.displayLibraryName();

        Employee e1 = new Employee("Rahul", 201, "Developer");
        e1.displayEmployeeDetails();
        Employee.displayTotalEmployees();

        Product p1 = new Product("Laptop", 50000, 2);
        p1.displayProductDetails();
        Product.updateDiscount(15);
        p1.displayProductDetails();

        Student s1 = new Student("Amit", 301, "A");
        s1.displayStudentDetails();
        Student.displayTotalStudents();
    }
}
