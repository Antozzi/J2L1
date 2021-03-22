package ad.j2.hw1.teams;
import java.util.Random;

public class Cat extends TeamMember {

    final static Random rnd = new Random();

    public Cat(String name) {
        super("Кот", name, rnd.nextInt(1000), rnd.nextInt(10));
    }
}
