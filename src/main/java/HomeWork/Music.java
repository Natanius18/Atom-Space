package HomeWork;

public class Music implements Play {
    String genre;
    String name;

   Music(String genre, String name){
       this.genre = genre;
       this.name = name;

   }

    @Override
    public void play() {
        System.out.println("The song " + '"' + name + '"' + " of " + genre + " genre is playing");
    }

//    @Override
////    public void stop() {

//    }
}
