package Polymorphism_Airline_2018_March;

public class EconomyClass implements BoardingTime {
	private double capacity;

	public EconomyClass(double capacity) {
		super();
		this.capacity = capacity;
	}

	@Override
	public double computeBoardingTime(){

		return capacity/10 + Math.sqrt(capacity);

	}
}
