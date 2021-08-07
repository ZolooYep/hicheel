package ManyForm;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EconomyClass ec = new EconomyClass();
		BusinessClass bc = new BusinessClass();
		FirstClass fc = new FirstClass();

		List<BoardingTime> bts = new ArrayList();

		bts.add(ec);
		bts.add(bc);
		bts.add(fc);

		int sum = 0;
		int count = 0;

		for (BoardingTime bt : bts) {
			count++;
			sum += bt.computeBoardingTime();
		}
		System.out.println("Average is: " + sum / count);

	}

}
