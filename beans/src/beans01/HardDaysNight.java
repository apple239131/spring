package beans01;

public class HardDaysNight implements CompactDisc {
    private String title="HardDaysNight";
    private String artist="周杰伦";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
