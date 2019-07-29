package cc.vgur.spring;

import cc.vgur.spring.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context= new ClassPathXmlApplicationContext("app-context.xml");
        final User admin = context.getBean("admin", User.class);
        final User moder = context.getBean("root", User.class);
        System.out.println(admin);
        System.out.println(moder);
    }
}
