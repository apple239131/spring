package beans02;

import beans01.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * JavaConfig显示装配
 */
@Configuration
public class CDplayerConfig02 {
    /**
     * @Bean注解告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean，可以使用name属性指定bean名字
     * @return
     */
//    @Bean(name="blueMusic")
//    public CompactDisc sgtPeees() {
//        return new SgtPeppers();
//    }

    @Bean
    public CompactDisc randomCD() {
        int choice=(int)Math.floor(Math.random()*4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        }else {
            return new Revolver();
        }
    }

    /**
     * JavaConfig中装配bean的最简单方法就是引用创建bean的方法
     *
     * cdPlayer()方法像sgtPeppers()方法一样，同样使用了@Bean注解，这表明这个方法会创建一个bean实例并将其注册到Spring应用上下文中。
     * 所创建的bean ID为cdPlayer，与方法的名字相同。cdPlayer()的方法体与sgtPeppers()稍微有些区别。
     * 在这里并没有使用默认的构造器构建实例，而是调用了需要传入CompactDisc对象的构造器来创建CDPlayer实例。
     *
     * 看起来，CompactDisc是通过调用sgtPeppers()得到的，但情况并非完全如此。因为sgtPeppers()方法上添加了@Bean注解，
     * Spring将会拦截所有对它的调用，并确保直接返回该方法所创建的bean，而不是每次都对其进行实际的调用
     *
     *
     */
//    @Bean
//    public CDplayer cDplayer() {
//        return new CDplayer(sgtPeees());
//    }

    /**
     * 默认情况，Spring中的bean都是单例的，没有必要为第二个CDplayer bean创建完全相同的SgtPeppers实例
     * Spring会拦截对sgtPeppers()的调用并确保返回的是Spring所创建的bean，也就是Spring本身在调用sgt方法创建
     * 的CompactDiscbean,因此两个CDplayer bean会得到相同的SgtPepper实例
     * @return
     */
//    @Bean
//    public CDplayer anotherCDplayer() {
//        return new CDplayer(sgtPeees());
//    }

    //更简单的引用bean方式  构造器注入
//    @Bean
//    public CDplayer cDplayer(CompactDisc compactDisc) {
//        return new CDplayer(compactDisc);
//    }

    //Setter方法注入
    @Bean
    public CDplayer cDplayer(CompactDisc compactDisc) {
        CDplayer cDplayer = new CDplayer(compactDisc);
        cDplayer.setCompactDisc(compactDisc);
        return cDplayer;
    }

}
