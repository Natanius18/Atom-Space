package HomeWork4;

import java.util.Random;
import java.util.function.Function;

public class Cat {
    protected long id;
    protected String name;
    protected Number weight;
    protected Number age;

    public Cat(long id, String name, Integer weight, Integer age) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    private static Name[] names = {Name.BARSIK, Name.MADISON, Name.TISHKA};
    private static String[] staffTypes = {"steel", "cast iron", "copper"};


    static int x = 1;
    public static Cat generateRandomCat() {
        Random random = new Random();
        int id = x;
        x++;
        String staff = Cat.staffTypes[random.nextInt(2)];
        Integer age = random.nextInt(25);
        Integer weight = random.nextInt(50);
        String name = Cat.names[random.nextInt(2)].toString();
        return new Cat(id, name, age, weight);
    }


    public <H extends Voice<Long>> void someMethod(H generic) {
        System.out.println(generic.voice());
    }

}

enum Name {
    BARSIK,
    TISHKA,
    MADISON
}