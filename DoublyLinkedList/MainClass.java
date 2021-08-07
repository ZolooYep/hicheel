package DoublyLinkedList;

public class MainClass {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        
        list.printNodesFromHead();
        list.printNodesFromTail();
        
        list.removeNode(2);
        list.addLast(7);
        list.removeLast();
        list.printNodesFromHead();
        
        String aa = "banne";
        String bb = "anne";
        
        
        System.out.println(aa.compareTo(bb));
    }
}
