package top.novashen.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private String name;

    private Dog dog;

    private Cat cat;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
    @Autowired
    @Qualifier("dog")
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    @Autowired
    @Qualifier("cat")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setName(String name) {
        this.name = name;
    }
}
