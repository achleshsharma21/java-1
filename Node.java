public class Node
{
    public static void main(String[] args)
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
}
public class LinkedListExample
{
    static Node head=null;
    public void insertAtend(int data)
    {
        Node newNode=new Node(10);
        if(head!=null)
        {
            Node temp=head;
            while(temp.next!=null)
            temp=temp.next;
            temp.next=newNode;
        }
    }