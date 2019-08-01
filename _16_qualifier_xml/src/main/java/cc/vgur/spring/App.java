package cc.vgur.spring;

import cc.vgur.spring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("app-ctx.xml");
        TestService testService = ctx.getBean(TestService.class);
        System.out.println(testService.getBestBeam().getClass().getSimpleName());
        System.out.println(testService.getBestImpl().getClass().getSimpleName());
        System.out.println(testService.getBestServiceBean().getClass().getSimpleName());
        System.out.println(testService.getBestServiceImpl().getClass().getSimpleName());
    }
}
