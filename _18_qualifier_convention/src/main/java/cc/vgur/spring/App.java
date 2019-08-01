package cc.vgur.spring;

import cc.vgur.spring.service.BetaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.applet.AppletContext;

@ComponentScan("cc.vgur.spring")
public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        final BetaService betaService = ctx.getBean(BetaService.class);
        System.out.println(betaService.getSimpleServiceBean().getClass().getSimpleName());
        System.out.println(betaService.getSimpleServiceImpl().getClass().getSimpleName());
    }
}
