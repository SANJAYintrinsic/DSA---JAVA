
Time O( n^2 )     Space  O( n )
    
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedlist{
    
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

    public void display(){
        if(head==null){
            System.out.println("empty node");
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
        linkedlist list=new linkedlist();

        System.out.println("enter the data of node:");
        
        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
            list.addnode(value);
        }

        list.display();
        sc.close();
    }
}
