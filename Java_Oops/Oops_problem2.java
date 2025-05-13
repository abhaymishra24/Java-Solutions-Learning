
// Oops_problem2.java
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Oops_problem2 {
    public static void main(String[] args) {
        // Creating an object of Person
        Person person = new Person("John Doe", 25);

        // Displaying details
        person.displayDetails();

        // Modifying details
        person.setName("Jane Doe");
        person.setAge(30);

        // Displaying updated details
        person.displayDetails();
    }
}