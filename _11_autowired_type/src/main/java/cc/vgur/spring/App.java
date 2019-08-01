package cc.vgur.spring;

import cc.vgur.spring.service.BetaService;
import cc.vgur.spring.service.MegaService;
import cc.vgur.spring.service.OmegaService;
import cc.vgur.spring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean(TestService.class));
        System.out.println(context.getBean(OmegaService.class).getMegaService());
        System.out.println(context.getBean(MegaService.class));
        System.out.println(context.getBean(BetaService.class));

    }
}
