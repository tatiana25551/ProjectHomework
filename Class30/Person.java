package Class30;
/*2) Create a Person class with following private fields: name, lastName, age, salary. 
Variables should be initialized through constructor.
Inside the class also create a method to print user details.*/

public class Person {
    String name;
     String lastName;
    int age;
     double salary;

    public Person(String name, String lastName, int age, double salary) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + "LastName: " + lastName + ", Age: " + age + "Salary: " + salary;
    }
}
