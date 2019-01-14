package telran.de.generics;

public class Team<T extends Sport> implements Comparable<Team<T>> {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Team<T> team) {
        return this.score - team.getScore();
    }

}
