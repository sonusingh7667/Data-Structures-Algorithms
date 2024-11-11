package Binary_Search_Tree;

public class isValid_BST {

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


    public static Boolean isValidBST(Node root, Node min, Node max){
        if (root == null){
            return true;
        }

        if (min != null && root.data <= min.data ){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min , root) && isValidBST(root.right, root,max);
    }
    public static void main(String[] args){

        int values[] = {1,3,4,5,6,8,10,11,14};
//        int values[] = {1,1,1};
        Node root = null;



        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if (isValidBST(root,null,  null)){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid.....");
        }
    }
}
