package top.novashen.pojo;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Value("novashen")
    public void setName(String name) {
        this.name = name;
    }
}
