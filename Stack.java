class Node{
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        next = null;
    }
}
public class Stack {

        static Node head;
        public static Boolean isEmpty(){
            return head==null;
        }

        public static void push (int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head= newNode;
            }
            else{
                newNode.next= head;
                head=newNode;
            }
        }
        public static int pop(){
            if(isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
       public static void main(String[] args) {
            push(1);
            push(2);
            System.out.println(pop());
           System.out.println(pop());
           System.out.println(pop());

        }
}
