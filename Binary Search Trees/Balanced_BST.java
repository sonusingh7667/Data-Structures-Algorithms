package Binary_Search_Tree;

import java.util.ArrayList;

public class Balanced_BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int  data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }

    public static Mirror_BST.Node BalancedBST(int arr[] , int start, int end){
        if(start> end){
            return null;
        }
        int mid = (start + end)/2;
        Mirror_BST.Node root = new Mirror_BST.Node(arr[mid]);
        root.left = BalancedBST(arr, start , mid-1);
        root.right = BalancedBST(arr, mid+1, end);
        return root;
    }

    public static void getInOrder(Node root, ArrayList<Integer> inorder){
        if (root == null){
            return;
        }

        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }

    public static  Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st> end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder , st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;

    }

    public static Node ConvertBalanced_BST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);
        //sorted inorder -> balanced BST
        root = createBST(inorder, 0,inorder.size()-1);
        return root;
    }


   public static void preOrder(Node root){
        if (root == null){
            return;
        }
       System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
   }



    public static void main(String[] args){

//        ......................BalancedBST..............................
//        int arr[] = {3,5,6,8,10,11,12};
//
//        Mirror_BST.Node root = BalancedBST(arr, 0, arr.length-1);
//        preOrder(root);
//        .....................................................

        /*
                 8
               /  \
              6    10
             /      \
            5        11
           /          \
          3           12
               given bst
        */

        Node root = new Node( 8);
        root.left = new Node( 6);
        root.left.left = new Node( 5);
        root.left.left.left = new Node( 3);

        root.right = new Node( 10);
        root.right.right = new Node( 11);
        root.right.right.right = new Node( 12);

        /*
                  8
               /   \
              5     11
             / \    / \
            3   6  10  12
            Expected BST

         */

        root = ConvertBalanced_BST(root);
        preOrder(root);

    }
}
