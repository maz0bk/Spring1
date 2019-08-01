package cc.vgur.spring;

import cc.vgur.spring.service.BestService;
import cc.vgur.spring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        final BestService bestService = context.getBean(BestService.class);
        final TestService testService= context.getBean(TestService.class);

        System.out.println(bestService.getTestService().hashCode());
        System.out.println(testService.hashCode());
        System.out.println();
        System.out.println(testService.getBestService().hashCode());
        System.out.println(bestService.hashCode());

    }
}
