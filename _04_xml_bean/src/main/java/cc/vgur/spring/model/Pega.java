package cc.vgur.spring.model;

import cc.vgur.spring.api.IPega;

public class Pega implements IPega {
    private String name;

    @Override
    public String toString() {
        return "Pega{" +
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
