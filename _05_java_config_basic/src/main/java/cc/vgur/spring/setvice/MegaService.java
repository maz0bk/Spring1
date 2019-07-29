package cc.vgur.spring.setvice;

public class MegaService {
    private String name;

    @Override
    public String toString() {
        return "MegaService{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MegaService(String name) {

        this.name = name;
    }
}
