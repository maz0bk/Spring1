package cc.vgur.spring.service;

import cc.vgur.spring.api.SimpleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bean")
public class SimpleServiceBean implements SimpleService {
}
