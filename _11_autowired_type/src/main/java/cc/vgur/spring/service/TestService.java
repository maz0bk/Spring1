package cc.vgur.spring.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class TestService {
    @Autowired
    private BestService bestService;
}
