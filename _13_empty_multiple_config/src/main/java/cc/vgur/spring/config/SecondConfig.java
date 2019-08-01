package cc.vgur.spring.config;

import cc.vgur.spring.service.BestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfig {
    @Bean
    public BestService bestService(){
        return new BestService();
    }
}
