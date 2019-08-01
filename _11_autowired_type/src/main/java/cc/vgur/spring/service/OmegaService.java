package cc.vgur.spring.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class OmegaService {
    private MegaService megaService;

    @Autowired
    public void setMegaService(MegaService megaService) {
        this.megaService = megaService;
    }
}
