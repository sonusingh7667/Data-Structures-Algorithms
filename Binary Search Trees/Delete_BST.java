package Binary_Search_Tree;

public class Delete_BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }


    public static Node Delete_BST(Node root, int val){
        if(root == null){
            return null;
        }
        if (root.data < val){
            root.right = Delete_BST(root.right, val);
        }
        else if(root.data > val){
            root.left = Delete_BST(root.left, val);
        }
        else{  // Voila
            //case--1 Leaf Node
            if (root.left == null && root.right == null){
                return null;
            }
            //case 2 - single children
            if (root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3 -> both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete_BST(root.right, IS.data);
        }
        return root;
    }
    public  static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }


    public static void main(String[] args){
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        root = Delete_BST(root , 5);
        System.out.println();
        inOrder(root);
    }
}
