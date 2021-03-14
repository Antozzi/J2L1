package ad.j2.hw1.teams;

public interface Competitor {
    void run(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
}
