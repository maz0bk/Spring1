package cc.vgur.spring.Service;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Getter
public class TestService {
    @Inject
    private BestService bestService;

    @Inject
    private MegaService megaService;
}
