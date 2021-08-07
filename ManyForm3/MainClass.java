package ManyForm3;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class MainClass {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chicken chicken = new Chicken();

		List<Animal> listAnimals = new ArrayList();

		listAnimals.add(dog);
		listAnimals.add(chicken);
		listAnimals.add(cat);

		int sum = 0;
		for (Animal animal : listAnimals) {
			sum += animal.countFoot();
		}

		System.out.println("Total foot of Animals are: " + sum);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Total");
		sb.append("foot");
		sb.append("of");

		System.out.println(sb);
	}

}
