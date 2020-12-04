package OOP.JukeBox.Alternative;

public class JukeBox {
    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;
    private SongSelector ts;

    public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector ts) {
        // Implement JukeBox
    }

    public Song getCurrentSong() {
        return ts.getCurrentSong();
    }

    public void setUser(User u) {
        this.user = u;
    }
}
