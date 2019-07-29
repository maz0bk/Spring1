package cc.vgur.spring.service;

import cc.vgur.spring.model.ServerAccess;

public class ConnectionService {
    public void connect(final ServerAccess serverAccess){
        System.out.println(serverAccess.getHost()+" "+ serverAccess.getPotr());
    }
}
