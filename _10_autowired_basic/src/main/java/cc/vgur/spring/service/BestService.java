package cc.vgur.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BestService {
    @Autowired
    private TestService testService;

    public TestService getTestService() {
        return testService;
    }
}
