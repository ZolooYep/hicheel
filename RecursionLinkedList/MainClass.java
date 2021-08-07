package RecursionLinkedList;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {
        mainStacks.add(1);
        mainStacks.add(2);
        mainStacks.add(3);
        mainStacks.add(4);
        mainStacks.add(5);
        mainStacks.add(6);
        
        boolean isFound = find(6);
        System.out.println("found: " + isFound);
    }
    
    static Stack<Integer> mainStacks = new Stack<>();
    static Stack<Integer> tempStacks = new Stack<>();
    
    public static boolean find(Integer num) {
        if (mainStacks.isEmpty()) {
            return false;
        }
        Integer lastInteger = mainStacks.pop();
        tempStacks.add(lastInteger);
        boolean isFound = false;
        if (lastInteger == num) {
            return true;
        }
        return find(num);
    }
}
