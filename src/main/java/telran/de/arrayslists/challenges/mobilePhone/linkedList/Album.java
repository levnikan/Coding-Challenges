package telran.de.arrayslists.challenges.mobilePhone.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Song> songList;

    public Album() {
        this.songList = new ArrayList<>();
    }

    public List<Song> getSongList() {
        return songList;
    }

    public boolean addSong(Song song) {
        if (findSong(song.getTitle()) != null) {
            System.out.println("The song is already in the album");
            return false;
        } else {
            this.songList.add(song);
            return true;
        }
    }

    public Song findSong(String title) {
        for (Song song : this.songList) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
