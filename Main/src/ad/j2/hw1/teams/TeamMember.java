package ad.j2.hw1.teams;

public abstract class TeamMember implements Competitor {
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    String onDistance;

    public boolean isOnDistance(){
        return onDistance == "Well Done!";
    }

    public TeamMember(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = "Well Done!";
    }

    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.printf("%s %s ran OK for distance %s meters\n",type,name,distance);
        } else {
            System.out.printf("%s %s could not run for %s meters distance\n",type,name,distance);
            onDistance = "Looser!!!";
        }
    }

    public void jump(int height){
        if (height <= maxJumpHeight){
            System.out.printf("%s %s jumped OK at height %s meters\n",type,name,height);
        } else {
            System.out.printf("%s %s could not jump at height %s meters\n",type,name,height);
            onDistance = "Looser!!!";
        }
    }

    public void showResult() {
        System.out.println(type + " " + name + ": " + onDistance);
    }

}
