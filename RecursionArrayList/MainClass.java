package RecursionArrayList;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("3");
        list.add("1");
        
        ArrayList<String> result = removeDuplications(list);
        System.out.println("result: " + result.toString());
    }
    
    static ArrayList<String> removeDuplications(ArrayList<String> list) {
        if (list.size() <=1 ) {
            return list;
        }
        ArrayList<String> result = new ArrayList<String>();
        String firstItem = list.remove(0);
        if (list.size() > 0) {
            result.addAll(removeDuplications(list));
        }
        if (!result.contains(firstItem)) {
            result.add(firstItem);
        }
        return result;
    }
}
