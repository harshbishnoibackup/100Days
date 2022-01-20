package Day5.Abstraction;

public class Abstraction extends Vehicle {

    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.show();
        ab.start();
    }

    @Override
    public void start() {
        System.out.println("Un-implement method");
    }

}

abstract class Vehicle {
    private int noOfTyers;

    public abstract void start();

    public void show() {
        System.out.println("Cocrete method");
        System.out.println(noOfTyers);
    }

}
