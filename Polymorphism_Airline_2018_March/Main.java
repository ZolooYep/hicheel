package Polymorphism_Airline_2018_March;

public class Main {

	public static void main(String[] args) {

		FirstClass fc = new FirstClass(Status.SILVER);
		BusinessClass bc = new BusinessClass(Status.GOLD);
		EconomyClass ec = new EconomyClass(441);
		BoardingTime[] objs = { fc, bc, ec };
		// expected output: 26.7
		System.out.println(Main.computeAverageBoardingTime(objs));

	}

	public static double computeAverageBoardingTime(BoardingTime[] bts) {
		double sum = 0;
		for (BoardingTime bt : bts) {
			sum += bt.computeBoardingTime();
		}
		return sum / bts.length;
	}
}
