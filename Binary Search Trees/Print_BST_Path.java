package Binary_Search_Tree;

import java.util.ArrayList;

public class Print_BST_Path {

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
    public static  Node insert( Node root, int val){
        if(root == null){
            root = new  Node(val);
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

    public static void inOrder( Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printPath( ArrayList<Integer> path){
        for (int i=0; i< path.size(); i++){
            System.out.print(path.get(i)+" ->");
        }
        System.out.println("null");
    }
    public static void Root_To_Leaf( Node root, ArrayList<Integer> path){
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

    }


    public static void main(String[] args){
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;



        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        Root_To_Leaf(root, new ArrayList<>());

    }
}
