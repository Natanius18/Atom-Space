package HomeWork;

public class Main {
    public static void main(String[] args) {
        Play game = new Game(11, "Fifa", "Computer Game");

        game.play();
        game.stop();

        Play music = new Music("Rock", "My life");

        music.play();
        music.stop();
    }
}
