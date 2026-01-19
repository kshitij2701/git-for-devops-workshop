package interfaces.animal;

// interface is blueprint of class
public interface Animal {

    public static final int max_age = 150;  // static constants
    public abstract void eat();
    void sleep();

    public static void info() {
        System.out.println("this is Animal interface");
    }

    public default void information() {
        this.eat();
        System.out.println("Animal interface");
    }
}
