package beans02;

import beans01.CompactDisc;

import java.util.List;

public class BlackDisc02 implements CompactDisc {
    private String title;
    private String artist;
    //磁道列表
    private List<String> tracks;
    public BlackDisc02(String title, String artist,List<String> tracks){
        this.artist=artist;
        this.title=title;
        this.tracks=tracks;
    }
    @Override
    public void play() {
        System.out.println("Playing " + title + artist);
        for (String track : tracks) {
            System.out.println("-Track:"+track);
        }

    }
}
