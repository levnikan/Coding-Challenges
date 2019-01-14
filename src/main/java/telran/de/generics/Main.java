package telran.de.generics;

public class Main {
    public static void main(String[] args) {
        League<Team<Basketball>> basketballLeague = new League<>("NBA");
        Team<Basketball> raptors = new Team<>("Raptors", 45);
        Team<Basketball> lakers = new Team<>("Lakers", 87);
        Team<Basketball> nuggets = new Team<>("Nuggets", 78);
        Team<Basketball> nicks = new Team<>("Nicks", 66);

        League<Team<Voleyball>> voleyballLeague = new League<>("FIBA");
        Team<Voleyball> cska = new Team<>("CSKA Moscow", 123);
        Team<Voleyball> zenit = new Team<>("Zenit", 100);
        Team<Voleyball> spartak = new Team<>("Spartak", 83);
        Team<Voleyball> dinamo = new Team<>("Dinamo", 77);

        basketballLeague.addTeam(raptors);
        basketballLeague.addTeam(lakers);
        basketballLeague.addTeam(nuggets);
        basketballLeague.addTeam(nicks);

        basketballLeague.showLeagueTable();

        voleyballLeague.addTeam(cska);
        voleyballLeague.addTeam(zenit);
        voleyballLeague.addTeam(spartak);
        voleyballLeague.addTeam(dinamo);

        voleyballLeague.showLeagueTable();

    }
}
