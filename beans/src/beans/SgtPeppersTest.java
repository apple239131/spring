package beans;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDplayerConfig.class)
public class SgtPeppersTest {
    @Autowired
    CompactDisc compactDisc;

    @org.junit.Test
    public void play() {
        System.out.println(compactDisc);
    }
}