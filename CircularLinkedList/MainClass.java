package CircularLinkedList;

public class MainClass {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        
        list.printNodes();
        
        list.removeNode(2);
        list.printNodes();
        
        list.addFirst(-1);
        list.printNodes();
        
        list.addLast(6);
        list.printNodes();
        
        list.removeFirst();
        list.removeLast();
        list.printNodes();
    }
}
