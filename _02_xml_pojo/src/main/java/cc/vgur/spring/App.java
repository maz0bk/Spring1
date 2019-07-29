package cc.vgur.spring;

import cc.vgur.spring.model.ServerAccess;
import cc.vgur.spring.service.ConnectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        final ServerAccess serverMega = context.getBean("serverMega", ServerAccess.class );
        final ServerAccess serverBeta = context.getBean("serverBeta", ServerAccess.class );

        final ConnectionService connectionService = context.getBean(ConnectionService.class);
        connectionService.connect(serverMega);
        connectionService.connect(serverBeta);
    }
}
