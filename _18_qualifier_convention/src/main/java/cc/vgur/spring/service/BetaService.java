package cc.vgur.spring.service;

import cc.vgur.spring.api.SimpleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class BetaService {
    @Autowired
    private SimpleService simpleServiceBean;

    @Autowired
    private SimpleService simpleServiceImpl;
}
