package cc.vgur.spring;

import cc.vgur.spring.api.MegaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MegaService megaService = context.getBean(MegaService.class);
        System.out.println(megaService.getClass().getSimpleName());
    }
}
