class SongClass {
    // Stats
    String title;
    String artist;

    // Behaviors
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void play() {
        System.out.println("Playing a song ...");
        System.out.print("Title: " + this.title);
        System.out.print(" ");
        System.out.println("By: " + this.artist);
    }
}

class Song {
    public static void main(String[] args) {
        SongClass song1 = new SongClass();
        song1.setTitle("Strager");
        song1.setArtist("Lauv");
        song1.play();

        SongClass song2 = new SongClass();
        song2.setTitle("Monster");
        song2.setArtist("Eminem ft. Rihana");
        song2.play();
    }
}