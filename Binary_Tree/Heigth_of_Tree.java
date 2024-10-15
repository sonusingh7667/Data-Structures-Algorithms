package Binary_Tree;
import java.util.*;
import Queue_Queue.Array_Queue;

import java.util.LinkedList;

public class Heigth_of_Tree {

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

    public static int heigth(Node root){
        if (root == null){
            return 0;
        }
        int left_heigth = heigth(root.left);
        int right_heigth = heigth(root.right);
//        int final = Math.max(left_heigth , right_heigth)+1;
        return Math.max(left_heigth, right_heigth)+1;

    }

    public static int countNode(Node root){
        if (root == null){
            return 0;
        }
        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);
        return leftCount + rightCount + 1;
    }


    public static int sumOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum + rightSum + root.data;
    }

//    .......................................................................................................
    public static int Diameter1(Node root){      // O(n^2)
        if (root == null){
            return 0;
        }

        int leftDia = Diameter1(root.left);
        int leftHeight = heigth(root.left);
        int rightDia = Diameter1(root.right);
        int rightHeigth = heigth(root.right);

        int selfDia = leftHeight + rightHeigth + 1;

        return Math.max(selfDia , Math.max(leftDia  , rightDia));
    }

//    ......Diameter...2nd..Approach.......

//    public static class Info{
//        int diam;
//        int height;
//
//        public Info(int diam, int height){
//            this.diam = diam;
//            this.height = height;
//        }
//
//
//    public static Info Diameter(Node root){
//        Info leftInfo = Diameter(root.left);
//        Info rightInfo = Diameter(root.right);
//
//        int diameter = Math.max(Math.max(leftInfo.diam, rightInfo.diam) , leftInfo.height+ rightInfo.height + 1);
//        int heightt = Math.max(leftInfo.height , rightInfo.height) + 1;
//
//        return new Info(diameter, heightt);
//    }
//    }


//    ............................................................................................................


    public static boolean isIdentical(Node node, Node subRoot){
        if (node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return  false;
        }

        if (!isIdentical(node.left , subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right , subRoot.right)){
            return false;
        }
        return true;
    }


    public static boolean isSubtree(Node root, Node subRoot){
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
    }

//    ..........................................................................................................

    public static class InfoO{
        Node node;
        int hd;

        public InfoO(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //Level Order
        Queue<InfoO> q = new LinkedList<>();
        HashMap<Integer , Node> map = new HashMap<>();
        int min = 0;
         int max = 0;

         q.add(new InfoO(root, 0));
         q.add(null);

         while (!q.isEmpty()){
             InfoO curr = q.remove();
             if (curr == null){
                 if (q.isEmpty()){
                     break;
                 }
                 else {
                     q.add(null);
                 }
             }
             else {
                 if (!map.containsKey(curr.hd)){  //first time my hd is occurring
                     map.put(curr.hd, curr.node);
                 }
                 if (curr.node.left != null){
                     q.add(new InfoO(curr.node.left, curr.hd-1));
                     min = Math.min(min , curr.hd-1);
                 }
                 if (curr.node.right != null){
                     q.add(new InfoO(curr.node.right, curr.hd+1));
                     max = Math.max(max , curr.hd+1);
                 }
             }
          }

         for (int i=min; i<=max; i++){
             System.out.print(map.get(i).data+" ");
         }
        System.out.println();
    }

//    ...........................................................................................................

    public static void K_Level(Node root, int level, int k){
        if (root == null){
            return;
        }
        if (level == k){
            System.out.print(root.data+" ");
            return;
        }
        K_Level(root.left , level+1, k);
        K_Level(root.right, level+1, k);
    }


//    ...........................................................................................................

    public static boolean getPath(Node root, int n,  ArrayList<Node> path){
        if (root == null){
            return false;
        }
        path.add(root);

        if (root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left , n , path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

//    ...................First--Approach................
    public static Node LCA(Node root, int n1, int n2){      //LCA -> Lowest common ancestor
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //Last common Ancestor...
        int i=0;
        for (; i<path1.size(); i++){
            if (path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last equal node -> i-1th
        Node LCA = path1.get(i-1);
        return LCA;

    }

//    ...................Second--Approach.............
    public static Node LCA2(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);

        //leftLCA = val   rightLCA = null
        if (rightLCA == null){
            return leftLCA;
        }
        if (leftLCA == null){
            return rightLCA;
        }
        return root;
    }


//    .............MIM DISTACE BETWEEN TWO NODES...............................................................

    public static int lcaDist(Node root, int n){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist+1;
        }
        else {
            return leftDist+1;
        }
    }

    public static int minDist(Node root, int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

//    ...........................K---ANCESTOR.....................................................

    public static int KAncestor(Node root, int n, int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right , n, k);

        if (leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

//    .............................Transform of sum tree...........................................................

    public static int transformOfSum(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transformOfSum(root.left);
        int rightChild = transformOfSum(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;


        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
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

        /*
                 1
                / \
               2    3
              /  \  / \
             4    5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
//        root.left.left.left = new Node(9);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        topView(root);

//        int k=3;
//        K_Level(root,1,k);

//        int n1 = 4;
//        int n2 = 6;
//        System.out.println(LCA2(root, n1,n2).data);

//        int n1 = 4;
//        int n2 = 6;
//        System.out.println(minDist(root, n1, n2));

//        int n = 5;
//        int k = 1;
//        KAncestor(root, n, k);

        transformOfSum(root);
        preOrder(root);



        /*
                2
              /   \
             4     5

         */
//       Node  subRoot = new Node(2);
//       subRoot.left = new Node(4);
//       subRoot.left.left =new Node(9);
//       subRoot.right = new Node(5);
//
//        System.out.println(isSubtree(root, subRoot));





//        System.out.println(heigth(root));
        //output -->> 3 level in this tree..

//        System.out.println(countNode(root));
//        //output --> 7
//
//        System.out.println(sumOfNode(root));
//        //output --> 28
//
//        System.out.println(Diameter1(root));


//        System.out.println(isSubtree(root, subRoot));

    }
}
