class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class binarytree{
    Node root=null;
    void order(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        order(node.left);
        order(node.right);
    }

    public static void main(String[] args){
        binarytree tree=new binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(6);
        tree.order(tree.root);
    }
}
