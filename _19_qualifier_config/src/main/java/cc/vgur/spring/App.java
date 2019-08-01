package cc.vgur.spring;

import cc.vgur.spring.config.AppConfig;
import cc.vgur.spring.service.BetaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        final BetaService betaService = ctx.getBean(BetaService.class);
        System.out.println(betaService.getSimpleServiceBean().getClass().getSimpleName());
        System.out.println(betaService.getSimpleServiceImpl().getClass().getSimpleName());
        System.out.println(betaService.getSimpleServiceTets().getClass().getSimpleName());
    }
}
