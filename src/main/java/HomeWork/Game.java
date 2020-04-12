package HomeWork;

public class Game extends Program implements Play {
    private int size;
    private String name;
    private String type;

    Game(int size, String name, String type) {
        super(size, name);
        this.type = type;
        this.size = size;
        this.name =name;
    }

    @Override
    public void run() {
        System.out.println("The game is running");
    }
    public void run(String mode) {
        System.out.println("The game is running in mode: " + mode);
    }

    @Override
    public void play() {
        System.out.println("The " + this.type + " " + this.name +" is playing. Size: " + size);

    }

//    @Override
//    public void stop() {
//    }
}
