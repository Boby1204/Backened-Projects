package listenify;

public class Song {
    public String title;
    public double duration;

    public Song(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        // In built fun
        // Present object in nice way
        // We can modify it too
        // Here object is "Song"
        // Print all the attributes in nice way
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
