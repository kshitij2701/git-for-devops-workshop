package interfaces.animal;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.sleep();
        System.out.println(Dog.max_age);
        System.out.println(Animal.max_age);
        Animal.info();
//        Dog.info(); Static method may only be called on its containing interface
        dog.information();
    }
}
