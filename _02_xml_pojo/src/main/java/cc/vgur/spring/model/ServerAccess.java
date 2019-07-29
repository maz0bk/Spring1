package cc.vgur.spring.model;

public class ServerAccess {
    private String host;
    private Integer potr;
    private String userName;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPotr() {
        return potr;
    }

    public void setPotr(Integer potr) {
        this.potr = potr;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
