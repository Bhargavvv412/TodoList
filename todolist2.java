public class todolist2 {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;

    public todolist2() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {
        
    }
}
