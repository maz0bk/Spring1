package cc.vgur.spring.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MegaService {
    @Autowired
    private BestService bestService;

}
