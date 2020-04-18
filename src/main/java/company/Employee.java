package company;

public class Employee {

    private String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void show(){
        System.out.println("Pracownik: " + name + ", wynagrodzenie:  " + salary);
    }
}
