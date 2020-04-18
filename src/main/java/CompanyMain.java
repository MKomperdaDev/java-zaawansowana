import company.Employee;
import company.Manager;
import company.Secretary;
import company.SuperSecretary;

public class CompanyMain {

    public static void main(String[] args) {

        Employee employee = new Employee(" Jan", 3200);
        Secretary secretary = new Secretary(" Anna ", 2500);
        Manager man = new Manager("Jarek", 5000, 1555);
        man.show();
        man.makeSpeach("Beda podwyzki");

        System.out.println("Jan zarabia: " + employee.getSalary());
        System.out.println("Jarek zarabia: " + man.getSalary());

        System.out.println("---");

        secretary.makeCall("555-888-222");
        //polimorfizm (wielopostaciowosc)
        Employee[]employees = new Employee[3];
        employees[0]=employee;
        employees[1]=secretary;
        employees[2]=man;

        for (Employee employee1 : employees) {
            employee1.show();
        }

        System.out.println("-----");
        man.makeCall("111-222-555");
        //rzutowanie na sekretarke
        man.setSecretary((Secretary)employees[1]);
        man.makeCall("111-333-777");
        man.setSecretary(new SuperSecretary("Kamila", 3000));
        man.makeCall("111-222-666");

    }
}
