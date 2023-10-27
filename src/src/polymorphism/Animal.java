package polymorphism;

public abstract class Animal {
    int legs;
    boolean hasFur;
    public Animal(int legs, boolean hasFur){
        this.legs = legs;
        this.hasFur = hasFur;
    }
    public abstract String speak();
    public abstract String move();
}
