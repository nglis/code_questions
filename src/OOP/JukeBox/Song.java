package OOP.JukeBox;

public class Song {
    private String title;

    private int currentSecond;
    private boolean isPlaying;

    public Song(String t) {
        title = t;
    }

    public void playSong() {
        isPlaying = true;
    }

    public void pauseSong() {
        isPlaying = false;
    }

    public void restart() {
        currentSecond = 0;
        isPlaying = true;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
