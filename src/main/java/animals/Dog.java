package animals;

public class Dog extends Animal implements Runner{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println("Woof!");
    }

    @Override
    public void run() {
        System.out.println("Hops hops");
    }
}
