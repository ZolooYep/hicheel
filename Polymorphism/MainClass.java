package Polymorphism;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(chicken);
        
        int sum = 0;
        for (Animal animal: animals) {
            sum = sum + animal.countFingers();
        }
        
        System.out.println("Total finger: " + sum);
    }
}