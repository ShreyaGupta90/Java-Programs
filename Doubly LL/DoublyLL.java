import java.util.*;
class DoublyLL{
    class Node{
        int data;   // declaration of variable 'data'
        Node next;  // pointer to next node
        Node pre;
        Node (int d) {data=d;}   //In Java, object references default to null when declared but not initialized, so pre and next is NULL by default
    }
    Node head; //points start of the node
    Scanner sc= new Scanner(System.in);

    void insert(){
        System.out.print("enter value= ");
        int v= sc.nextInt();
        Node n= new Node(v); // creates a new node with value v
        if (head==null) head=n; //empty LL it automatically feed null in pre and next in head or n node
        else{
            Node t=head; //points head
            while(t.next!=null) t=t.next;  // runs until t.next=NULL; go to the last node
            t.next=n; // now NULL replaces with n; attach new node at the end
            n.pre=t;  // and in n previous t will links means n is become the last one and in n.next=NULL already; link back from new node to previous
        }
        System.out.println(v+" inserted");
        System.out.println(" ");
    }

    void delete(){
        //if empty LL
        if (head==null) { System.out.println("empty list");System.out.println(" "); return;}
        System.out.println("enter value to delete");
        int val=sc.nextInt();
        Node t=head;
        //if 1st node has to delete
        if (t.data==val){ head= t.next; // If head node itself needs to be deleted i.e. first node then head points to head.next
        if (head!=null) head.pre=null; //means in pre of first node we kept null as usual happens
        System.out.println(val+" deleted");System.out.println(" ");return;}
        // Search for node with matching value
        while(t!=null&& t.data!=val) t=t.next;
        if (t==null){System.out.println("value not found");return;}//LL having no value which is given to delete
        if(t.next!=null)t.next.pre=t.pre;// node is not last and if it is last this line skips // give address in upcoming node i.e. t.next
        if(t.pre!=null)t.pre.next=t.next;// links t.pre node to t.next and if // give address in pre node
        System.out.println(val+" deleted");
        System.out.println(" ");
    }
    
    void traverse(){
        //empty LL
        if (head==null){System.out.println("empty list");System.out.println(" "); return;}//comes outside the function
        Node t=head;
        //forward list
        System.out.println("List(forward)");
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println(" ");
        //backward traversing
        System.out.println("List(backward)");
        Node last=head;
        while(last.next!=null){last=last.next;}
        while (last != null) {System.out.print(last.data + " ");last = last.pre;}
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DoublyLL list=new DoublyLL();
        int choice;
        do { 
            System.out.println("1=Insertion\n2=Deletion\n3=Traversing\n4=Exit");
            System.out.print("Choice = "); choice=sc.nextInt();
            switch(choice){
                case 1:
                    list.insert();
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.traverse();
                    break;
                case 4:
                    break;
            }
        } while (choice!=4);
    }
}