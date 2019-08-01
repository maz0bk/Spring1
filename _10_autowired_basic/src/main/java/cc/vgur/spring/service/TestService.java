package cc.vgur.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    @Autowired
    private BestService bestService;

    public BestService getBestService() {
        return bestService;
    }
}
