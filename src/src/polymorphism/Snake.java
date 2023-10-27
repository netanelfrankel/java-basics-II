package polymorphism;

public class Snake extends Animal{
    public Snake(){
        super(0,false);
    }

    @Override
    public String speak() {
        return "hiss hiss";
    }

    @Override
    public String move() {
        return "the snake is slithering";
    }
}
