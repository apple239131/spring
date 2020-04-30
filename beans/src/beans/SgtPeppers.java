package beans;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title="双截棍";
    private String artist="周杰伦";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
