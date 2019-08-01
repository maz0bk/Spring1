package cc.vgur.spring.config;

import cc.vgur.spring.api.SimpleService;
import cc.vgur.spring.service.BetaService;
import cc.vgur.spring.service.SimpleServiceBean;
import cc.vgur.spring.service.SimpleServiceImpl;
import cc.vgur.spring.service.SimpleServiceTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cc.vgur.spring")
public class AppConfig {
    @Bean
    @Qualifier("bean")
    public SimpleService simpleBean() {return new SimpleServiceBean();}

    @Bean
    @Qualifier("impl")
    public SimpleService simpleImpl() {return new SimpleServiceImpl();}

    @Bean
    @Qualifier("test")
    public SimpleService simpleTest() {return new SimpleServiceTest();}

    @Bean
    public BetaService betaService (
            @Qualifier("bean") SimpleService simpleServiceBean,
            @Qualifier("impl") SimpleService simpleServiceImpl,
            @Qualifier("test") SimpleService simpleServiceTest
    ) {
        final BetaService betaService = new BetaService();
        betaService.setSimpleServiceBean(simpleServiceBean);
        betaService.setSimpleServiceImpl(simpleServiceImpl);
        betaService.setSimpleServiceTets(simpleServiceTest);
        return betaService;
    }
}
