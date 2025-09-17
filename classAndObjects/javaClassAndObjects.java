
import java.util.*;

public class javaClassAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- LEVEL 1 PROGRAMS ----------------

        // 1. Employee Details
        Employee e = new Employee("Nischal", 101, 5000000);
        e.show();

        // 2. Circle Area and Circumference
        Circle c = new Circle(7);
        c.show();

        // 3. Item Inventory
        Item i = new Item(1, "Pen", 10);
        i.show(5);

        // 4. Mobile Phone Details
        MobilePhone m = new MobilePhone("Samsung", "S23", 70000);
        m.show();

        // ---------------- LEVEL 2 PROGRAMS ----------------

        // 1. Student Report
        Student s = new Student("Nischal", 201, 85);
        s.show();

        // 2. ATM Simulation
        BankAccount b = new BankAccount("Nischal", 12345, 1000);
        b.deposit(500);
        b.withdraw(300);
        b.show();

        // 3. Palindrome Checker
        PalindromeChecker p = new PalindromeChecker("madam");
        p.show();

        // 4. Movie Ticket Booking
        MovieTicket t = new MovieTicket("Avengers", 12, 300);
        t.book();
        t.show();

        // 5. Shopping Cart
        CartItem cart = new CartItem("Book", 200, 2);
        cart.add(1);
        cart.remove(1);
        cart.show();

        sc.close();
    }
}

// ---------------- LEVEL 1 CLASSES ----------------

// Employee Class
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void show() {
        System.out.println("Employee: " + name + " " + id + " " + salary);
    }
}

// Circle Class
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void show() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle: Area=" + area + " Circumference=" + circumference);
    }
}

// Item Class
class Item {
    int code;
    String name;
    double price;
    Item(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    void show(int quantity) {
        double total = price * quantity;
        System.out.println("Item: " + code + " " + name + " " + price + " Total=" + total);
    }
}

// MobilePhone Class
class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void show() {
        System.out.println("Mobile: " + brand + " " + model + " " + price);
    }
}

// ---------------- LEVEL 2 CLASSES ----------------

// Student Class
class Student {
    String name;
    int roll;
    int marks;
    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }
    void show() {
        System.out.println("Student: " + name + " " + roll + " " + marks + " Grade=" + grade());
    }
}

// BankAccount Class
class BankAccount {
    String holder;
    int number;
    double balance;
    BankAccount(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }
    void show() {
        System.out.println("Account: " + holder + " " + number + " Balance=" + balance);
    }
}

// PalindromeChecker Class
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    boolean isPalindrome() {
        String r = new StringBuilder(text).reverse().toString();
        return text.equals(r);
    }
    void show() {
        System.out.println("Palindrome: " + text + " -> " + isPalindrome());
    }
}

// MovieTicket Class
class MovieTicket {
    String movie;
    int seat;
    double price;
    boolean booked = false;
    MovieTicket(String movie, int seat, double price) {
        this.movie = movie;
        this.seat = seat;
        this.price = price;
    }
    void book() {
        booked = true;
    }
    void show() {
        System.out.println("Ticket: " + movie + " Seat=" + seat + " Price=" + price + " Booked=" + booked);
    }
}

// CartItem Class
class CartItem {
    String name;
    double price;
    int qty;
    CartItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    void add(int q) {
        qty += q;
    }
    void remove(int q) {
        if (q <= qty) qty -= q;
    }
    void show() {
        System.out.println("Cart: " + name + " Price=" + price + " Qty=" + qty + " Total=" + (price * qty));
    }
}
