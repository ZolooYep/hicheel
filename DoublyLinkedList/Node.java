package DoublyLinkedList;

class Node {
    public Node nextNode;
    public Node previousNode;
    public int value;
    
    public Node(int value) {
        this.value = value;
        this.nextNode = null;
        this.previousNode = null;
    }
}
