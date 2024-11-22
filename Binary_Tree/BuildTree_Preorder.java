package Binary_Tree;

public class BuildTree_Preorder {

    public static class Node{
        int data;
        Node left;
        Node right;

        public  Node(int data){
            this.data=  data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{          //O(n)
        static  int idx = -1;
        public  static Node builtTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);

            return newNode;
        }

    }


    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.println(root.data);
    }
}