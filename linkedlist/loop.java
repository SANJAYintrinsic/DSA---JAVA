import java.util.*;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class loop {
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

    public boolean hasloop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void loopd(int index){

        if(head==null) {return;}
        Node temp=head;
        Node lastnode=head;
        Node targetloop=null;
        int count=0;

        while(lastnode.next!=null){
            if(count==index){
                targetloop=lastnode;
            }
            lastnode=lastnode.next;
            count++;
        }

        if(count==index){
            targetloop=lastnode;
        }

        if(targetloop!=null){
            lastnode.next=targetloop;
        }
    }


    public void display(){
        if(head==null){
            System.out.println("empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        loop l=new loop();
        System.out.println("linkedlist");

        while(true){
            int value=sc.nextInt();
            if(value==-1){
                break;
            }
            l.addnode(value);
        }

        System.out.print("Enter index to loop back to (or -2 for no loop): "); 
        int loopIndex = sc.nextInt(); 
        if (loopIndex != -2) { 
            l.loopd(loopIndex);
        } 
        System.out.println("Checking for loop..."); 
        if (l.hasloop()) { 
            System.out.println("Result: Loop detected!"); 
        } 
        else { 
            System.out.println("Result: No loop detected."); 
        }
        l.display();
        sc.close();
    }
}
