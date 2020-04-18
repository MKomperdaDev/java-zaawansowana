package electronics;

public class MailMachine implements EmailSender {

    Tablet tab;
    Phone phone;

    public MailMachine(Device device) {
        if (device instanceof Tablet) {
            this.tab = (Tablet) device;
        } else if (device instanceof Phone) {
            this.phone = (Phone) device;
        }
    }


    @Override
    public void sendEmail(String message) {
        if (tab == null) {
            phone.sendEmail(message);
        } else {
            tab.sendMessage(Messages.Email, message);
        }
    }
}
