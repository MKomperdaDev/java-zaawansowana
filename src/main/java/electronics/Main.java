package electronics;

public class Main {

    public static void main(String[] args) {


        Phone phone = new Phone("S5", 5555);
        Tablet tablet = new Tablet("Galaxy");
        MailMachine mailMachine = new MailMachine(tablet);
        mailMachine.sendEmail("Bla bla bla");

        MailMachine mailMachine1 = new MailMachine(phone);
        mailMachine1.sendEmail("Dzyn Dzyn");
    }
}
