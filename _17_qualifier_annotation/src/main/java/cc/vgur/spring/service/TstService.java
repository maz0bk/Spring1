package cc.vgur.spring.service;

import cc.vgur.spring.annotation.NotWanted;
import cc.vgur.spring.annotation.Tested;
import cc.vgur.spring.annotation.Wanted;
import cc.vgur.spring.api.BestService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TstService {
    @Wanted
    @Autowired
    private BestService bestServiceOne;

    @Tested
    @Autowired
    private  BestService bestServiceTwo;

    @NotWanted
    @Autowired
    private BestService bestService;
}
