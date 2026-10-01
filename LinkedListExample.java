public class LinkedListExample {
    Node head=null;
    public void print(Node head){
      Node current=head;
      while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
      }
      System.out.println("NULL");
    }
    public Node addAtFront(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }
    public Node addAtEnd(Node head,int data){
      Node newNode=new Node(data);
      if(head==null){
        head=newNode;
        return head;
      }
      Node current=head;
      while(current.next!=null){
     current=current.next;
      }
      current.next=newNode;
     return head;
    }
    public Node removeAtFront(Node head){
      if(head==null){
        return null;
      }
      Node current=head;
      head=current.next;
      current=null;
      return head;
    }
    public Node removeAtEnd(Node head){
      Node current=head,prev=null;
      while(current.next!=null){
        prev=current;
        current=current.next;
      }
      prev.next=null;
      current=null;
      return head;
    }
    public static void main(String[] args) {
        LinkedListExample lle=new LinkedListExample();
        /*Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        lle.head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        lle.print(lle.head);*/
        lle.head=lle.addAtEnd(lle.head, 10);
        lle.head=lle.addAtEnd(lle.head, 20);
         lle.head=lle.addAtEnd(lle.head, 30);
          lle.head=lle.addAtEnd(lle.head, 40);
        lle.print(lle.head);
        lle.head=lle.removeAtFront(lle.head);
        lle.print(lle.head);
       /* System.err.println(n1+" "+n1.data+" "+n1.next);
        System.err.println(n2+" "+n2.data+" "+n2.next);
        System.err.println(n3+" "+n3.data+" "+n3.next);
        System.err.println(n4+" "+n4.data+" "+n4.next);*/ 

    }
}
    