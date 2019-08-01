package cc.vgur.spring.service;

import cc.vgur.spring.api.SimpleService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
public class BestService {
    @Autowired
    @Qualifier("bean")
    private SimpleService simpleBean;

    @Autowired
    @Qualifier("impl")
    private SimpleService simpleImpl;
}
