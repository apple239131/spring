package beans02;

import beans01.CompactDisc;

public class BlackDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlackDisc(String title, String artist) {
        this.artist=artist;
        this.title=title;
    }
    @Override
    public void play() {
        System.out.println("Playing"+title+"by"+artist);
    }
}
