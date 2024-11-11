package Binary_Search_Tree;
import java.util.*;

public class Build_BST {
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

//    ...................................................................................................

    public static boolean SearchKey(Node root, int key){   //TC--- O(H)
        if (root == null){
            return false;
        }
        else if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return  SearchKey(root.left, key);
        }
        else{
            return SearchKey(root.right , key);
        }
    }

//    ............................................................................

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

//    ................................................................

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

//    .....................................................................

    public static void printPath(ArrayList<Integer> path){
        for (int i=0; i< path.size(); i++){
            System.out.print(path.get(i)+" ->");
        }
        System.out.println("null");
    }
    public static void Root_To_Leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null){
            printPath(path);
        }

        Root_To_Leaf(root.left, path);
        Root_To_Leaf(root.right, path);
        path.remove(path.size()-1);
        return;
    }

    public static Boolean isValidBST(Node root, Node min, Node max){
        if (root == null){
            return true;
        }

        if (min != null && root.data <= min.data ){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min , max) && isValidBST(root.right, min,max);
    }


    public static void main(String [] args){
//        int values[] = {5,1,3,4,2,7};
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;



        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (SearchKey(root, 9)){
            System.out.println("Element is in the tree... found");
        }
        else{
            System.out.println("Not found....??????");
        }
//
//        root = Delete_BST(root , 5);
//        System.out.println();
//
//        inOrder(root);

        printIn_Range(root, 5, 11);

//       Root_To_Leaf(root, new ArrayList<>());

        if (isValidBST(root,null,  null)){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid.....");
        }
    }
}
