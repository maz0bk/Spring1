package cc.vgur.spring.model;

public class Mega {
    private String name;

    @Override
    public String toString() {
        return "Mega{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
