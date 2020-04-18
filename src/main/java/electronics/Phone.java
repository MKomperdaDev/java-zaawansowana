package electronics;

public class Phone extends Device implements EmailSender {
    public Phone(String model, int number) {
        super(model);
        this.number = number;
    }

    @Override
    void turmOn() {
        System.out.println("Wlaczam telefon");
    }

    @Override
    void turmOff() {
        System.out.println("Wylaczam telefon");
    }

    int number;

    public void makeCall(String callNumber) {
        System.out.println(" Z numeru " + number + " dzwonie do " + callNumber);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Przy pomocy telefonu wysylam " + Messages.Email + " o tresci " + message);
    }
}
