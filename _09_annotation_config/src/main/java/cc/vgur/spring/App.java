package cc.vgur.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.applet.AppletContext;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean("megaService"));
        System.out.println(context.getBean("megaService"));
        System.out.println(context.getBean("betaService"));
        System.out.println(context.getBean("betaService"));

    }
}
