package ad.j2.hw1.teams;

public class Team {
    private final String teamName;
    Competitor[] teamMembers;


    public Team(String teamName, Competitor[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name: "+teamName;
    }

    public Competitor[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Competitor c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersCompletedCourse(){
        for(Competitor c: teamMembers){
            if(c.isOnDistance())
            c.showResult();
        }
    }
}
