package cc.vgur.spring;

import cc.vgur.spring.config.AppConfig;
import cc.vgur.spring.setvice.MegaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(MegaService.class));
    }
}
