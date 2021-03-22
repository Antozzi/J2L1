package ad.j2.hw1.courses;

import ad.j2.hw1.teams.TeamMember;
import ad.j2.hw1.teams.Competitor;

public class RunningLane extends Obstacle {
    private int distance;

    public RunningLane(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
