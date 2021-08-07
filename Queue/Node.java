package Queue;

//import DoublyLinkedList.Node;

class Node {
    public Node nextNode;
    public Node previousNode;
    //public String value;
	public String data;
    
    public Node(String data) {
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
    }
}
