package ad.j2.hw1.teams;
import java.util.Random;

public class Man extends TeamMember{

    final static Random rnd = new Random();

    public Man(String name) {
        super("Man", name, rnd.nextInt(1000), rnd.nextInt(10));
    }
}
