public class stackManipulator {
    private Node top;

    private class Node {
        int data;
        Node next;
    }

    public  stackManipulator.Node Stack(){
        top=null;
        return top;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public  void push(int data){
        Node oldTop=top;
        top=new Node();
        top.data=data;
        top.next=oldTop;
    }

    public int pop(){
        int data=top.data;
        top=top.next;
        return data;
    }

    public  void main(String[]args){
        push(90);
    }

}

