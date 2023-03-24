package top.novashen.pojo;

public class Hello {
    private String name;

    public Hello() {
        System.out.println("Bean Created!");
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
