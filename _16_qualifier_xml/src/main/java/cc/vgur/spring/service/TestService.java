package cc.vgur.spring.service;

import cc.vgur.spring.api.BestService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Getter
@Setter
@Component
public class TestService {
    @Autowired
    @Qualifier("bean")
    private BestService bestServiceBean;

    @Autowired
    @Qualifier("impl")
    private BestService bestServiceImpl;

    @Autowired
    @Resource(name = "bestServiceImpl")
    private BestService bestImpl;

    @Autowired
    @Resource(name = "bestServiceBean")
    private BestService bestBeam;
}
