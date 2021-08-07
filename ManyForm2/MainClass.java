package ManyForm2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		BusinessClass bc = new BusinessClass();
		EconomyClass ec = new EconomyClass();

		List<BoardingTime> btList = new ArrayList();

		btList.add(fc);
		btList.add(bc);
		btList.add(ec);

		System.out.println("Average of boarding price is: " + calculateAverageBoarding(btList));

	}

	public static int calculateAverageBoarding(List<BoardingTime> btList) {
		int sum = 0;
		int count = 0;
		for (BoardingTime bt : btList) {
			sum += bt.computeBoardingTime();
			count++;
		}

		return sum / count;
	}

}
