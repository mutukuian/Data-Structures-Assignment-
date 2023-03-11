import javax.swing.event.MenuDragMouseListener;

public class MmustLinkedIn{
    private String username;
    private String password;
    private String email;

    public MmustLinkedIn(String username,String password, String email){
        this.username=username;
        this.password=password;
        this.email=email;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getemail(){
        return email;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public class LinkedInList{
        private Nodedata head;
        private int size;
        public void linkedInList(){
            this.head=null;
            this.size=0;
        }
        private class Node{
            private String data;
            private Nodedata next;
        
        public Node(String data){
            this.data=data;
            this.next=null;
          }
        }
        public void add(String data){
            Node  Node=new Node(data);
            if(head==null){
                head=new Nodedata();
            }else{
                Nodedata current=head;
                while(current.next!=null){
                    current=(Nodedata) current.next;
                }
                current.next=new Nodedata();
                size++;
            }
               public int size(){
                    return size;
                }
                Node current=head;
                while(current!=null){
                    System.out.print(current.data+" ");
                }
                

            }

        }
        public  void main(String[]args){
            MmustLinkedIn("Group",123,"group123@gmail.com");
        }
        private void MmustLinkedIn(String string, int i, String string2) {
        }
        
    }

