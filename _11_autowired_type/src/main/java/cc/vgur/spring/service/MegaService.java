package cc.vgur.spring.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MegaService {
    private final BestService bestService;

    @Autowired
    public MegaService(BestService bestService){
        this.bestService = bestService;
    }

}
