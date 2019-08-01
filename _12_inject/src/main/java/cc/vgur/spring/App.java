package cc.vgur.spring;

import cc.vgur.spring.Service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean(TestService.class));
    }
}
