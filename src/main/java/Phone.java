public class Phone {
    public String model;
    public int memory;
    public int camera;
}

interface Call{
    void writeNumber();

   default void call(){
       System.out.println("Abonent is calling");
   }

}