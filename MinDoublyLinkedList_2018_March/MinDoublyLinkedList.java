package MinDoublyLinkedList_2018_March;

public class MinDoublyLinkedList {

		Node header;
		public MinDoublyLinkedList(){
			header = new Node();
		}
		public void add(String item){
			//implement
			Node firstNode = header.next;
			if(firstNode == null){
				header.next = new Node(item, null, header);
				return;
			}
			if (firstNode.value.compareTo(item) < 0) {
				Node secondNode = firstNode.next;
				Node newNode = new Node(item, secondNode, firstNode);
				firstNode.next = newNode;
				if(secondNode!= null){
					secondNode.previous = newNode;
				}
			}
			else {
				Node newNode = new Node(item, firstNode, header);
				header.next = newNode;
				firstNode.previous = newNode;
			}

		}
		@Override
		public String toString() {

			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();

		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}

		class Node {
			String value;
			Node next;
			Node previous;

			public String toString() {
				return value == null ? "null" : value;
			}

			public Node(String value, Node next, Node previous){
				this.value = value;
				this.next = next;
				this.previous = previous;
			}

			public Node(){

			}
		}

		public static void main(String[] args){
			MinDoublyLinkedList list = new MinDoublyLinkedList();
			list.add("bob");
			System.out.println(list); //expect:  bob
			list.add("harry");
			System.out.println(list); //expect:  bob harry
			list.add("steve");
			System.out.println(list); //expect:  bob steve harry
			list.add("anne");
			System.out.println(list); //expect:  anne bob steve harry

		}
}
