package cc.vgur.spring.config;

import cc.vgur.spring.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfig {
    @Bean
    public TestService testService(){
        return new TestService();
    }
}
