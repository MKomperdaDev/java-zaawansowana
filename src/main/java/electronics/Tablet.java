package electronics;

public class Tablet extends Device implements EmailSender{
    @Override
    void turmOn() {
        System.out.println("Wlaczam tablet");
    }

    @Override
    void turmOff() {
        System.out.println("Wylaczam tablet");
    }

    public Tablet(String model) {
        super(model);
    }
    public void sendMessage(Messages ms, String message){
        System.out.println("Wysylam przy pomocy Tableta wiadomosc " + ms + " o tresci: " + message);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Uzywam tebletu ");
        sendMessage(Messages.Email , message);
    }
}
