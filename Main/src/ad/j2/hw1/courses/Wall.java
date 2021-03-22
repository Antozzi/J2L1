package ad.j2.hw1.courses;

import ad.j2.hw1.teams.TeamMember;
import ad.j2.hw1.teams.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
