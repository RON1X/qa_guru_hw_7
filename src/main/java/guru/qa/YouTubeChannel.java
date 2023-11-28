package guru.qa;

public class YouTubeChannel {
    private String name;
    private int video;
    private int views;
    private int followers;

    protected YouTubeChannel(String name, int video, int views, int followers) {
        this.name = name;
        this.video = video;
        this.views = views;
        this.followers = followers;
    }

    protected String getName() {
        return name;
    }
}
