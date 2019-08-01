package cc.vgur.spring;

import cc.vgur.spring.service.BestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        BestService bestService = ctx.getBean(BestService.class);
        System.out.println(bestService.getSimpleBean().getClass().getSimpleName());
        System.out.println(bestService.getSimpleImpl().getClass().getSimpleName());
    }



}
