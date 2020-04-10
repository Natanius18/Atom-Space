public class Phone implements Call{
    public String model;
    public int memory;
    public int camera;

    @Override
    public void writeNumber() {
        System.out.println("Abonent is writing");
    }
}

interface Call{
    void writeNumber();

   default void call(){
       System.out.println("Abonent is calling");
   }

}