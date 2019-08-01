package cc.vgur.spring.service;

import cc.vgur.spring.api.SimpleService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
public class BetaService {
    private SimpleService simpleServiceBean;
    private SimpleService simpleServiceImpl;
    private SimpleService simpleServiceTets;
}
