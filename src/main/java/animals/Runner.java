package animals;

public interface Runner {

    void run();
    default void count(){
        System.out.println("3..2..1..");
         run();
    }
}
