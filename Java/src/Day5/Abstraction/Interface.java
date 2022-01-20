package Day5.Abstraction;

public class Interface implements Vehicle1, Vehicle2 {

    @Override
    public void show() {
        System.out.println("Class method");
    }

    public static void main(String[] args) {
        Interface in = new Interface();
        in.show();
    }
}

interface Vehicle1 {
    default void show() {
        System.out.println("interface method");
    }
}

interface Vehicle2 {
    public abstract void show();
}