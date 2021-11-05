package MidtermProjectCS203_GroupTwo;

public class Video implements Comparable<Video>{
    private String title;
    private double durationInMinutes;
    private int views;
    private int likes;
    private double watchTime;

    public Video() {
        title="youtube";
        durationInMinutes=120;
        views=1000000;
        likes=100000;
        watchTime=567489993;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public int compareTo(Video o) {
        if(watchTime>o.watchTime)return 1;
        if(watchTime==o.watchTime)return 0;
        else return -1;
    }

    @Override
    public boolean equals(Object obj) {
        Video v= (Video) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", views=" + views +
                ", likes=" + likes +
                ", watchTime=" + watchTime +
                '}';
    }
}
