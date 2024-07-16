package Hashing.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Hashing {

    static class HashMap<K,V>
    {
        class Node
        {
            K key;
            V value;

            public Node(K key,V value)
            {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap()
        {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<buckets.length; i++)
            {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key)
        {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi)
        {
           LinkedList<Node> LL = buckets[bi];
           for(int i=0; i<LL.size(); i++)
           {
               if(LL.get(i).key == key)
               {
                   return i;
               }
           }
           return -1;
        }

        private void rehash()
        {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];
            for(int i=0; i<N*2; i++)
            {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBuckets.length; i++)
            {
                LinkedList<Node> LL = buckets[i];
                for (int j=0; j<LL.size(); j++)
                {
                    Node node = LL.get(j);
                    put(node.key,node.value);
                }
            }
        }

        private void put(K key, V value)
        {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1)
            {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else
            {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0)
            {
                rehash();
            }

        }

        public V get(K key)
        {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1)
            {
                return null;
            }
            else
            {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key)
        {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        public V remove(K key)
        {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1)
            {
                return null;
            }
            else
            {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++) //bi
            {
                LinkedList<Node> LL = buckets[i];
                for(int j=0; j<LL.size(); j++) //di
                {
                    Node node = LL.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty()
        {
            return n == 0;
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Palestine", 200);
        map.put("Pakistan", 180);
        map.put("Syria", 100);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++)
        {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
    }
}
