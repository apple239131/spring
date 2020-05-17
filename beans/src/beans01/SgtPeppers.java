package beans01;

import org.springframework.stereotype.Component;

/**
 * Spring应用上下文中所有bean都会给定一个ID，没有明确指定的就根据类名给其指定一个ID，也就是类名的第一个字母小写
 * @Component("goodCls")或者@Named("xxx")来为bean设置ID
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title="双截棍";
    private String artist="周杰伦";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
