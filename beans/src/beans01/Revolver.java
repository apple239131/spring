package beans01;

public class Revolver implements CompactDisc {
    private String title="revolver";
    private String artist="aaa";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
