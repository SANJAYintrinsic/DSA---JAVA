import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linked{
    Node head=null;
    public void addnode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void sort(){
        
        Boolean swapped;
        Node curr;
        Node last;
        do{
            swapped=false;
            curr=head;
            while (curr.next!=null) {
                if(curr.data > curr.next.data){
                    int temp=curr.data;
                    curr.data=curr.next.data;
                    curr.next.data=temp;
                    swapped=true;
                }
                curr=curr.next;
            }
            last=curr;
        }while(swapped);
    }


    public void display(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linked l=new linked();
        System.out.println("linkedlist");

        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
            l.addnode(value);
        }

        l.display();
        l.sort();
        l.display();
        sc.close();
    }
}
