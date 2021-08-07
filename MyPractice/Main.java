package MyPractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList();

		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(7);
		arrList.add(2);
		
		System.out.println(f(arrList));
	}

	public static int f(List<Integer> arrayList) {

		if (arrayList.size() == 0) {
			return 0;
		}

		return arrayList.get(0) + f(arrayList.subList(1, arrayList.size()));
	}

}
