package company;

public class SuperSecretary extends Secretary {
    public SuperSecretary(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Supersekretarka ");
        super.makeCall(number);
        System.out.println("Przynosza kawe");
    }
}
