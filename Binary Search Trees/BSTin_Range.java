package Binary_Search_Tree;

public class BSTin_Range {

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

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printIn_Range(Node root, int k1, int k2){
        if (root == null){
            return;
        }
        if (root.data >= k1 && root.data <= k2){
            printIn_Range(root.left, k1, k2);
            System.out.print(root.data+" ");
            printIn_Range(root.right,k1,k2);
        }
        else if(root.data > k1){
            printIn_Range(root.left , k1, k2);
        }
        else{
            printIn_Range(root.right , k1, k2);
        }
    }

    public static void main(String[] args){
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;



        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        printIn_Range(root, 5, 11);
    }
}
