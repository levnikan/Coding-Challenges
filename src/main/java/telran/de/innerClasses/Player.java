package telran.de.innerClasses;

import java.util.*;

public class Player {

    public static void main(String[] args) {
        List<Album> albumList = new ArrayList<>();
        List<Song> playlist = new LinkedList<>();
        Song song1 = new Song("Gangnam Style", 3.55);
        Song song2 = new Song("Faradenza", 4.50);
        Song song3 = new Song("Batareyka", 4.30);
        Song song4 = new Song("Osen", 4.46);
        Song song5 = new Song("Don't cry", 5.50);


        Album popAlbum = new Album();
        popAlbum.addSong(song1);
        popAlbum.addSong(song2);

        Album classicAlbum = new Album();
        classicAlbum.addSong(song3);
        classicAlbum.addSong(song4);
        classicAlbum.addSong(song5);

        albumList.add(popAlbum);
        albumList.add(classicAlbum);

        playlist.add(classicAlbum.findSong("Osen"));
        playlist.add(popAlbum.findSong("Faradenza"));
        playlist.add(classicAlbum.findSong("Don't cry"));
        playlist.add(classicAlbum.findSong("Batareyka"));

        play(playlist);
    }

    private static void printMenu() {
        System.out.println(
                "1 - Quit\n" +
                        "2 - Next song\n" +
                        "3 - Previous song\n" +
                        "4 - Replay\n" +
                        "5 - Show all songs in the list\n" +
                        "6 - Remove the current song from the playlist\n\n" +
                        "Please select your action...\n");
    }

    private static void showAllSongs(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
    }

    private static void play(List playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator listIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("No songs in the itenerary");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    System.out.println("Quitting the player");
                    quit = true;
                    break;

                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 4:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;

                case 5:
                    showAllSongs(playlist);
                    break;

                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    }

}
