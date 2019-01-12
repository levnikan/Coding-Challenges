package telran.de.arrayslists.challenges.mobilePhone.linkedList;

public class Song {
    private String title;
    private Double duration;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "title: " + title + " duration: " + duration;
    }
}
