package ad.j2.hw1.teams;
import java.util.Random;

public class Robot extends TeamMember{

    final static Random rnd = new Random();

    public Robot(String name) {
        super("Робот", name, rnd.nextInt(1000), rnd.nextInt(10));
    }
}
