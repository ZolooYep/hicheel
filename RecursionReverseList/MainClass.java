package RecursionReverseList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("3");
		list.add("1");

		List<String> result = reverseListRecursively(list);
		System.out.println("result: " + result.toString());
	}

	private static List<String> reverseListRecursively(List<String> list) {
		if (list.size() <= 1) {
			return list;
		}
		List<String> reversed = new ArrayList<>();
		reversed.add(list.get(list.size() - 1)); // last element
		reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
		return reversed;
	}
}
