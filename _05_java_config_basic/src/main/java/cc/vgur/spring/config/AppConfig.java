package cc.vgur.spring.config;

import cc.vgur.spring.setvice.MegaService;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public MegaService megaService(){
        return new MegaService("123123");
    }
}
