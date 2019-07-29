package cc.vgur.spring;

import cc.vgur.spring.api.IPega;
import cc.vgur.spring.model.Beta;
import cc.vgur.spring.model.Mega;
import cc.vgur.spring.model.Pega;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        final Beta beta = context.getBean(Beta.class);
        final Mega mega = context.getBean(Mega.class);

        final Pega pega = context.getBean(Pega.class);
        final IPega pega2 = context.getBean(IPega.class);

        System.out.println(beta);
        System.out.println(mega);
        System.out.println(pega);
        System.out.println(pega2);
        System.out.println(pega.hashCode() == pega2.hashCode());

    }
}
