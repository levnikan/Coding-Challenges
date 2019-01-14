package telran.de.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String name;
    private List<T> leagueTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (leagueTeams.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            leagueTeams.add(team);
            System.out.println(team.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(leagueTeams);
        for (T t : leagueTeams){
            System.out.println(t.getName() + ": " + t.getScore());
        }
    }
}
