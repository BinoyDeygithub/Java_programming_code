package Java_projects;
class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class OOPs_custom_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 custom1 = new Employee1(); // Instantiating a new Employee Object
        Employee1 john = new Employee1(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        custom1.id = 12;
        custom1.salary = 34;
        custom1.name = "Binoy Dey Programmer";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        custom1.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
}}
