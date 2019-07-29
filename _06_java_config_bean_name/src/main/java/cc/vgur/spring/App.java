package cc.vgur.spring;

import cc.vgur.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("DEFAULT"));
        System.out.println(context.getBean("FIRST"));
        System.out.println(context.getBean("SECOND"));
    }

}
