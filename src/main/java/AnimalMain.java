import animals.*;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Reks");
        Cat cat = new Cat("Kitty");
        Duck duck = new Duck("Donald");

        Runner runner = dog;
        dog.saySomething();
        runner.count();
//klasy anonimowe
        Runner otherRunner = new Runner() {
            @Override
            public void run() {
                System.out.println("Biegne!");
            }
        };
        Runner otherRunner2 = () -> System.out.println("Biegne!");
        otherRunner.run();

        Animal snail = new Animal("Romek") {
            @Override
            public void saySomething() {

            }
        };

    }
}
