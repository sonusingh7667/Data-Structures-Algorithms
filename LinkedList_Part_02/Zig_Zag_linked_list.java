package LinkedList_PART_2;

public class Zig_Zag_linked_list {



        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;

        // Add node at the beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Print the linked list
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Function to get the middle node
        public Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // Function to merge two sorted linked lists
        public Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1);  // Temporary node to start the merged list
            Node temp = mergedLL;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }

            // Add remaining nodes from head1 or head2
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next;  // Return the actual merged list
        }

        // Merge sort function for linked list
        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;  // Base case: 0 or 1 element
            }

            // Find mid node
            Node mid = getMid(head);

            Node rightHead = mid.next;
            mid.next = null;

            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // Merge the two sorted halves
            return merge(newLeft, newRight);
        }


//        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$


        public void zigZag(){
            //find mid
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            //reverse second half
            Node curr = mid.next;
            mid.next =null;
            Node prev = null;
            Node next;

            while (curr != null){
                next = curr.next;
                curr.next =prev;
                prev = curr;
                curr = next;
            }

            Node left = head;
            Node right = prev;
            Node nextL, nextR;

            //Alternate merge ---> zig zag merge
            while (left != null && right != null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }

        public static void main(String[] args) {

            Zig_Zag_linked_list ll = new Zig_Zag_linked_list();
            ll.addFirst(6);
            ll.addFirst(5);
            ll.addFirst(4);
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
            ll.print();
            ll.zigZag();
            ll.print();
        }
    }


