package polymorphism;

public class Lion extends Animal {
    public Lion(){
        super(4,true);
    }

    @Override
    public String speak() {
        return "Roar";
    }

    @Override
    public String move() {
        return "The lion is on the prowl";
    }
}
