class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class Course {
    String title;
    Course(String title) {
        this.title = title;
    }
}

class School {
    String name;
    Student[] students;
    Course[] courses;
    School(String name, Student[] students, Course[] courses) {
        this.name = name;
        this.students = students;
        this.courses = courses;
    }
}

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String title;
    Faculty[] faculties;
    Department(String title, Faculty[] faculties) {
        this.title = title;
        this.faculties = faculties;
    }
}

class University {
    String name;
    Department[] departments;
    University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }
}

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println(name + " consulting " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    Doctor[] doctors;
    Patient[] patients;
    Hospital(Doctor[] doctors, Patient[] patients) {
        this.doctors = doctors;
        this.patients = patients;
    }
}

class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
}

class Order {
    Product[] products;
    Order(Product[] products) {
        this.products = products;
    }
}

class Customer {
    String name;
    Order[] orders;
    Customer(String name, Order[] orders) {
        this.name = name;
        this.orders = orders;
    }
}

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class UniversityCourse {
    String title;
    Student[] students;
    Professor professor;
    UniversityCourse(String title, Student[] students, Professor professor) {
        this.title = title;
        this.students = students;
        this.professor = professor;
    }
}

class UniversitySystem {
    Student[] students;
    Professor[] professors;
    UniversityCourse[] courses;
    UniversitySystem(Student[] students, Professor[] professors, UniversityCourse[] courses) {
        this.students = students;
        this.professors = professors;
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        School school = new School("Greenwood", new Student[]{s1, s2}, new Course[]{c1, c2});

        Faculty f1 = new Faculty("Dr. Smith");
        Department d1 = new Department("Computer Science", new Faculty[]{f1});
        University uni = new University("Tech University", new Department[]{d1});

        Doctor doc = new Doctor("Dr. Adams");
        Patient p1 = new Patient("John");
        Hospital hosp = new Hospital(new Doctor[]{doc}, new Patient[]{p1});
        doc.consult(p1);

        Product prod1 = new Product("Laptop");
        Order order1 = new Order(new Product[]{prod1});
        Customer cust = new Customer("Charlie", new Order[]{order1});

        Professor prof = new Professor("Dr. Brown");
        UniversityCourse uc1 = new UniversityCourse("Physics", new Student[]{s1}, prof);
        UniversitySystem usys = new UniversitySystem(new Student[]{s1, s2}, new Professor[]{prof}, new UniversityCourse[]{uc1});
    }
}
