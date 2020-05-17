package beans01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 自动装配
 * 让Spring自动满足bean依赖，在Spring上下文中自动寻找匹配某个bean需求的其他bean.
 * @Autowired注解不仅可以用在构造器上，还可以用在属性的Setter方法上
 *  @Autowired(required=false)当required属性为false时，Sring会尝试自动装配，如果没有匹配的bean，就处于为装配的状态
 *还可以使用@Injec替换@Autowried
 */
@Component
public class CDplayer implements MediaPlayer{
    private CompactDisc cd;


    @Autowired
    public CDplayer(CompactDisc cd) {
        this.cd=cd;
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd=cd;
    }

    @Override
    public void paly() {
       cd.play();
    }
}
