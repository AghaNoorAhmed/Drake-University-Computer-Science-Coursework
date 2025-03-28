
// Student - Agha Noor Ahmed Khan
// Assignment Eight - Objects
// Instructor - Dr. Eric Manly
// Class - CS67 - Object Oriented Programming
// Score - Four/Four - Maximum

// First Class: Person with private fields, accessor, and mutator methods
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor for age
    public int getAge() {
        return age;
    }

    // Mutator for age
    public void setAge(int age) {
        this.age = age;
    }

    // toString method to provide meaningful output
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Second Class: Employee with Person as a private field, accessor, and mutator methods
class Employee {
    private Person person;
    private double salary;

    // Constructor
    public Employee(Person person, double salary) {
        this.person = person;
        this.salary = salary;
    }

    // Accessor for person
    public Person getPerson() {
        return person;
    }

    // Mutator for person
    public void setPerson(Person person) {
        this.person = person;
    }

    // Accessor for salary
    public double getSalary() {
        return salary;
    }

    // Mutator for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to provide meaningful output
    @Override
    public String toString() {
        return person.toString() + ", Salary: " + salary;
    }
}

// Driver class to test the program
public class Assignment8 {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Smith", 25);

        // Create Employee objects
        Employee employee1 = new Employee(person1, 50000);
        Employee employee2 = new Employee(person2, 60000);

        // Print out the objects
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
