package cc.vgur.spring.config;

import cc.vgur.spring.service.BetaService;
import cc.vgur.spring.service.MegaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {
    @Bean
    public BetaService betaService () {return new BetaService();}

    @Bean
    @Scope("prototype")
    public MegaService megaService () {return new MegaService();}
}
