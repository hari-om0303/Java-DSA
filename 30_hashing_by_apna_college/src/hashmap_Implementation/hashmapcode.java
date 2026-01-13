package hashmap_Implementation;

import java.util.LinkedList;

public class hashmapcode{
    static class HashMap<K,V> { //generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

      int n; //n - nodes
      int N; //N - buckets

      private LinkedList<Node> bucket[]; // N - buckets;

        public HashMap(){
            this.N=4;
            this.bucket = new LinkedList[N];
            for (int i=0; i<N; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        public int hashfunction(K key){
             int bi = key.hashCode();
             return Math.abs(bi) % N;
        }

        public int searchInLL(K key , int bi){
           LinkedList<Node> l1 = bucket[bi];
           for (int i=0; i< l1.size(); i++){
               if (l1.get(i).key == key){
                   return i;
               }
           }
           return -1;
        }

        public void rehash(){
            LinkedList<Node>[] oldBucket = bucket;
            N = N * 2; // update bucket size
            bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }

            n = 0; // reset count

            for (LinkedList<Node> ll : oldBucket) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key , V value){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi); //di = -1
            if (di == -1){ //key does not exit
               bucket[bi].add(new Node(key , value));
               n++;
            }else {// key exist
                Node node = bucket[bi].get(di);
                node.value = value;
            }

           double lambda = (double) n/N;
            if (lambda>2){
                rehash();
            }
        }

        public V get(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi);
            if (di == -1){
                return null;
            }else {
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public boolean ConatainsKey(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi);
            if (di == -1){
                return false;
            }else {
                return true;
            }
        }

        public V remove(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key , bi);
            if (di == -1){
                return null;
            }else {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                for (Node node : bucket[i]) {
                    sb.append(node.key)
                            .append("=")
                            .append(node.value)
                            .append(", ");
                }
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
       HashMap<String , Integer> map = new HashMap<>();
       map.put("adish" , 100);
       map.put("hariom" , 99);
       map.put("harsh" , 99);
       map.put("hardik" , 100);
       map.put("ansa", 23);
        System.out.println(map);

        map.remove("ansa");
        System.out.println(map);

        System.out.println(map.ConatainsKey("hariom"));

    }

}
