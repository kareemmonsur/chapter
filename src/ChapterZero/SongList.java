package ChapterZero;

import java.util.ArrayList;
import java.util.LinkedList;

public class SongList {
    private String title;
    private String artist;
    private double duration;
    private ArrayList<Music> music = new ArrayList<Music>();

    public SongList() {}

    public boolean addToSongList(String title, double duration) {
            music.add(new Music(title, duration));
            System.out.println(title + "successfully added");
            return true;
        }

    public boolean deleteFromSongList(String title, double duration) {
        music.remove(new Music(title, duration));
        System.out.println(title + "successfully deleted");
        return true;
    }

    public boolean addToPlayList(int trackNumber, String title, LinkedList<Music> playlist){
        int index = trackNumber -1;
        if (index > 0 && index <= this.music.size())
            PlayList.add(this.music.get(index));
        return true;
    }


}
