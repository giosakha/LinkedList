
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
    public Node Pseudo(Node head1, Node head2){
    if(head1==null){
        return head2;
    }
    if(head2==null){
        return head1;
    }
    Node p = head1;
    while(p.next!=null){
       p=p.next;
    }
    p.next=head2;
    return head1;
}

}

public class LinkedList {
       public static int countNodes(Node head)  {
       Node current = head;
       int count =0;
   while(current!=null){
       current = current.next;
       count++;
   }
   return count;
}
   public static boolean search(Node head,int x){
       Node current =head;
       while(current!=null){
           if(current.data ==x){
               return true;
               
           }
         current = current.next;
         
       }
       return false;
   }
   public static void insertAfter(Node prevNode, int newData){
       
       if(prevNode == null){
           System.out.println("The previous node cannot be null");
       return;
       }
       
       Node newNode = new Node(newData);
       
       newNode.next = prevNode.next;
       
       prevNode.next=newNode;
   }
   public static void print(Node head){
        Node current = head;
       while(current!=null){
           System.out.print(current.data+"--->");
           current= current.next;
       }
       System.out.print("Null");
   }
   public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
   
       public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next=null;
       
          int nodeCount= countNodes(head);

          System.out.println (nodeCount);
boolean NodeSearch = search(head, 5);
System.out.println(NodeSearch);
         
  Node prevNode = head.next;
        insertAfter(prevNode, 4);
        print(head);
        System.out.println();
                Node ReverseHead = reverse(head);

        print(ReverseHead);
       
       
       
       
       }
}
