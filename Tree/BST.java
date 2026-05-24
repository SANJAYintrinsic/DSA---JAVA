// Binary search - Inorder traversal - Sorted array
   
//   root - left(small) - right(big)

//  Binary search - start from ROOT

/* 
 Operation  Balanced tree Worst Case(Skewed) 
 ---------  ------------  ---------- 
 Search     O(log n)      O(n)       
 Insert     O(log n)      O(n)       
 Delete     O(log n)      O(n)       
*/

//     static - no need object inside Main
//     non-static - need object inside Main

class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class bst{

    static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }

        if(key>root.data){
            root.right=insert(root.right, key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }
        return root;
    }

    static void order(Node root){
        if(root!=null){
            order(root.left);
            System.out.print(root.data+" ");
            order(root.right);
        }
    }
    public static void main(String[] args) {
        Node root=null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        order(root);
    }
}
