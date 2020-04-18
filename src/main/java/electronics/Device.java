package electronics;

public abstract class Device {
    String model;

    public Device(String model) {
        this.model = model;
    }

    abstract void turmOn();

    abstract void turmOff();
}
