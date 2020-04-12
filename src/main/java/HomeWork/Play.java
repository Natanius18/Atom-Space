package HomeWork;

public interface Play {

    void play();

    default void stop(){
            System.out.println("Stop playing");
        }
}
