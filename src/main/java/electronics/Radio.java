package electronics;

public class Radio extends Device {
    public Radio(String model) {
        super(model);
    }

    @Override
    void turmOn() {
        System.out.println("Wlaczam radnio");
    }

    @Override
    void turmOff() {
        System.out.println("Wylaczam radnio");
    }
    public void changeChanel(String channel){
        System.out.println("Zmieniam kanal na " + channel);
    }
}
