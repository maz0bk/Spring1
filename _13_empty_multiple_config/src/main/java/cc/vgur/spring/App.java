package cc.vgur.spring;

import cc.vgur.spring.service.BestService;
import cc.vgur.spring.service.MegaService;
import cc.vgur.spring.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("cc.vgur.spring");
        context.refresh();
        MegaService megaService = context.getBean(MegaService.class);
        BestService bestService = context.getBean(BestService.class);
        TestService testService = context.getBean(TestService.class);
        System.out.println(megaService);
        System.out.println(bestService);
        System.out.println(testService);
    }
}
