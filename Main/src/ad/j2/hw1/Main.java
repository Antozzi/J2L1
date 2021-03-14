package ad.j2.hw1;
import java.util.Random;
import ad.j2.hw1.courses.*;
import ad.j2.hw1.teams.*;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int distance = rnd.nextInt(1000);
        int height = rnd.nextInt(10);

        Competitor[] competitors = {
                new Man("Vasya"),
                new Cat("Murzik"),
                new Robot("Kuzya"),
                new Man("Fedya")
        };
        Obstacle[] obstacles = {new RunningLane(distance), new Wall(height)};

        Team team = new Team("ManCatRobots", competitors);
        System.out.println("***Team Name***");
        System.out.println(team.getTeamName());
        System.out.println("***Show Team Results before Course***");
        team.showResults();
        // start a new Course
        Course course = new Course(obstacles);
        System.out.println("***Team > Course***");
        course.doIt(team);
        System.out.println("***Show Winners***");
        team.showMembersCompletedCourse();
        System.out.println("***Show Team Results after Course***");
        team.showResults();


    }

}

