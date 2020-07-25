//package HomeWork4;
//
//import java.util.Random;
//
//public class Cat {
//    protected long id;
//    protected String name;
//    protected <E> Number weight;
//    protected <C> Number age;
//
//    public Cat(long id, String name, Number weight, Number age) {
//        this.id = increment;
//        this.name = name;
//        this.weight = weight;
//        this.age = age;
//        increment++
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Number getWeight() {
//        return weight;
//    }
//
//    public void setWeight(Integer weight) {
//        this.weight = weight;
//    }
//
//    public Number getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//
//    private static Name[] names = {Name.BARSIK, Name.MADISON, Name.TISHKA};
//    private static String[] staffTypes = {"steel", "cast iron", "copper"};
//
//
//    static long increment = 1;
//    public static Cat generateRandomCat() {
//        Random random = new Random();
//        long id = increment;
//        increment++;
//        String staff = Cat.staffTypes[random.nextInt(2)];
//        Number age = random.nextInt(25);
//        Number weight = random.nextInt(50);
//        String name = Cat.names[random.nextInt(2)].toString();
//        return new Cat(id, name, age, weight);
//    }
//
//
//    public <H extends Voice<Long>> void someMethod(H generic) {
//        System.out.println(generic.voice());
//    }
//
//}
//
//enum Name {
//    BARSIK,
//    TISHKA,
//    MADISON
//}