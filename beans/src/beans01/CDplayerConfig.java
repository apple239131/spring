package beans01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan以配置类所在包作为基础包，默认扫描与配置类相同的包及这个包的所有子包，查找带有@Component的类,
 * 并且在Spring中自动为其创建一个bean
 * 可以设置@Component属性value指定基础包@Component("beans")
 * 还可以通过@Component("basePackages="beans","xxx")可以添加多个
 * 以上设置的基础包是以String类型设置的，类型不安全，可以设置为包中所含的类或接口
 * @Component(basePackageClasses={CDplayer.class,DVDplayer.class}
 */
@Configuration
@ComponentScan
public class CDplayerConfig {
}
