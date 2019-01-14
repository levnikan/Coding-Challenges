package telran.de.innerClasses;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private SongList songList;

    public Album() {
        this.songList = new SongList();
    }

    public SongList getSongList() {
        return this.songList;
    }


    public boolean addSong(Song song) {
        return this.songList.addSong(song);
    }

    public Song findSong(String title) {
        return this.songList.findSong(title);
    }

    private class SongList {

        private List<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean addSong(Song song) {
            if (findSong(song.getTitle()) != null) {
                System.out.println("The song is already in the album");
                return false;
            } else {
                this.songs.add(new Song(song.getTitle(), song.getDuration()));
                return true;
            }
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
    }


}
