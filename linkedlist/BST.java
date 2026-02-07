import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BST{
    Node root;
    Node insert(Node root,int value){
        if(root==null){
            return new Node(value);
        }
        if(value>root.data){
            root.right=insert(root.right,value);
        }
        else if(value<root.data){
            root.left=insert(root.left,value);
        }

        return root;
    }

    void order(Node root){
        if(root!=null){
            order(root.left);
            order(root.right);
            System.out.print(root.data+" ");
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        BST tree=new BST();

        for(int i=0;i<size;i++){
            int value=sc.nextInt();
            tree.root=tree.insert(tree.root, value);
        }
        tree.order(tree.root);
    }
}
