package computer1;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " включен");
    }

    public void off() {
        System.out.println(this.name + " выключен");
    }

}
