package Hashing_Hashing;
import java.util.*;

public class HashMap_Implementation_code {

    public static class HashMap<K, V>{
        private class Node{
            K keys;
            V value;

            public Node(K keys, V value){
                this.keys = keys;
                this.value = value;
            }
        }

        private int size;  //n
        private LinkedList<Node> buckets[];  //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.size = 4;
            this.buckets = new LinkedList[4];
            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private  int hashFunction(K keys){
            int hc = keys.hashCode();
            return Math.abs(hc) % size;
        }
        private int SearchLL(K keys, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.keys == keys){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K keys, V value){
            int bi = hashFunction(keys);
            int di = SearchLL(keys,bi);

            if (di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add((new Node(keys, value)));
                size++;
            }
        }

        public boolean containKey(K keys){
            return false;
        }
        public V remove(K keys){
            return null;
        }

        public V get(K keys){
            return null;
        }
    }



    public static void main(String[] args){

    }
}




























