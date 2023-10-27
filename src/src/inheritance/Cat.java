package inheritance;

public class Cat {
    String name;
    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This is a cat named"+" "+getName();
    }
}
