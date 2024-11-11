package Binary_Search_Tree;

public class Search_key {

    public static class Node{
        int data;
       Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left= this.right = null;
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
    public  static void main(String[] args){
        int values[] = {1,3,4,5,6,8,10,11,14};
        Node root = null;



        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }


        if (SearchKey(root, 11)){
            System.out.println("Element is in the tree... found");
        }
        else{
            System.out.println("Not found....??????");
        }
    }
}
