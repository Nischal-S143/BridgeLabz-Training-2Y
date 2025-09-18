class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
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

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
}

class LibraryBook {
    String title;
    String author;
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
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
}

public class PracticePrograms {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", 500);
        Circle c1 = new Circle(5);
        Person p1 = new Person("Nischal", 21);
        Person p2 = new Person(p1);
        HotelBooking hb1 = new HotelBooking("Rahul", "Deluxe", 3);
        LibraryBook lb1 = new LibraryBook("C Programming", "Dennis Ritchie", 300, true);
        lb1.borrowBook();
        CarRental cr1 = new CarRental("Amit", "Hyundai i20", 5);

        System.out.println("Book: " + b1.title + ", " + b1.author + ", " + b1.price);
        System.out.println("Circle radius: " + c1.radius);
        System.out.println("Person Copy: " + p2.name + ", " + p2.age);
        System.out.println("Hotel Booking: " + hb1.guestName + ", " + hb1.roomType + ", " + hb1.nights);
        System.out.println("Library Book availability: " + lb1.availability);
        System.out.println("Car Rental total cost: " + cr1.calculateTotalCost());
    }
}
