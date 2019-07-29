package cc.vgur.spring.model;

public class Beta {
    private String name;

    @Override
    public String toString() {
        return "Beta{" +
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
