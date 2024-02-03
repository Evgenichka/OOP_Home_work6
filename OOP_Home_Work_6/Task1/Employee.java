package Task1;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }


// Согласно принципу единственной ответственности
// переносим данный метод в одельный класс EmployeeFileHandler

    // public void saveEmployeeToFile() {

    }

// Код для сохранения данных сотрудника в файл
// Этот метод ответственен за сохранение в файл и нарушает SRP.