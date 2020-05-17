package beans01;

public class WhiteAlbum implements CompactDisc {
    private String title="WhiteAlbum";
    private String artist="周杰伦";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
