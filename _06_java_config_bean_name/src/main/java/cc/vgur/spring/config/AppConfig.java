package cc.vgur.spring.config;

import cc.vgur.spring.service.MegaService;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("DEFAULT")
    public MegaService megaService() {return new MegaService("default");}

    @Bean("FIRST")
    public MegaService megaServiceFirst() {return new MegaService("first");}

    @Bean("SECOND")
    public MegaService megaServiceSecond() {return new MegaService("second");}
}
