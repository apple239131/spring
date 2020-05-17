package beans01;

import org.springframework.beans.factory.annotation.Autowired;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfig.class)
public class SgtPeppersTest {
    @Autowired
    CompactDisc compactDisc;
    @Autowired
    MediaPlayer player;


    @org.junit.Test
    public void play() {
        System.out.println(compactDisc);
    }

    @org.junit.Test
    public void play2() {
        player.paly();
        //双截棍周杰伦
    }
}