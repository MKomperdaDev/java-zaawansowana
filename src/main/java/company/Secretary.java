package company;

public class Secretary extends Employee{
    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public void makeCall(String number){
        System.out.println("Dzwonie pod numer " + number);
    }

    @Override
    public final int getSalary() {
        return salary;
    }
}
