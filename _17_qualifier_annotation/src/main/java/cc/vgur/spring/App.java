package cc.vgur.spring;

import cc.vgur.spring.service.TstService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        TstService tstService = ctx.getBean(TstService.class);
        System.out.println(tstService.getBestServiceOne().getClass().getSimpleName());
        System.out.println(tstService.getBestServiceTwo().getClass().getSimpleName());
        System.out.println(tstService.getBestService().getClass().getSimpleName());
    }
}
