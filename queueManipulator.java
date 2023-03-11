public class queueManipulator {
    private Node head, tail;

    private class Node{
        int data;
        Node next;
    }

    public void Queue(){
        head=null;
        tail=null;
    }

    public boolean isEmpty(){
        return head==null;
    } 

    public  void enqueue(int data){
        Node oldTail = tail;
        tail=new Node();
        tail.data=data;
        tail.next=null;
        if(isEmpty()){
            head=tail;
        }
        else{
            oldTail.next=tail;
        }
    }

    public int dequeue(){
        int data=head.data;
        head=head.next;
        if(isEmpty()){
            tail=null;
        }
        return data;
    }

     public  void main(String[]args) {
        enqueue(50);
    }
}
