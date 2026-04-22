// write a java program to defime a class, descibe its constructor, overload the constructor and intantiate its objects.
class Student {
    String name;
    int age;
    String course;

    // Default constructor
    Student() {
        this.name = "pavan";
        this.age = 20;
        this.course = "MCA";
        system.out.println("Default constructor called");

    }

    // Parameterized constructor
    Student(String student name){
        name=bharath;
        age =20;
        course = "MCA";
        System.out.println("Parameterized constructor called");
    
    } 
    student(string student name,int studentage){
        name = student name;
            age = studentage;
            course = "MCA";
            System.out.println("Overloaded constructor called");    
        
    }
    student(string studentname,int studentage,string studentcourse){
        name = studentname;
        age = studentage;
        course = studentcourse;
        System.out.println("Overloaded constructor with all parameters called");
    }
    void display() {
        system.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        system.out.println("-----------------------");
    }
}
public class constructor {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.display();

        // Using parameterized constructor
        Student student2 = new Student("Bharath");
        student2.display();

        // Using overloaded constructor with two parameters
        Student student3 = new Student("Pavan", 22);
        student3.display();

        // Using overloaded constructor with all parameters
        Student student4 = new Student("Anjali", 21, "BCA");
        student4.display();
    }
}