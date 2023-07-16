package CustomHashMapImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomHashMap<K,V> {
    private List<MapNode<K,V>> bucket;
    private int capacity; //length of the bucket
    private int size; //number of elements in the map
    private final int INITIAL_CAPACITY = 5; // initial length of the bucket array

    public CustomHashMap(){
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    public int getBucketIndex(K key){
        int hashCode = key.hashCode(); //hashmap has to implement hashCode to get the hashcode for key
        // which comes from the Object class and is the memory address of the same.
        return hashCode % capacity;
    }
    private class MapNode<K,V>{
        K key;
        V value;
        MapNode<K,V> next;

        public MapNode(K key , V value){
            this.key = key;
            this.value = value;
        }
    }
    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head != null){
            if (head.key.equals(key)) // hashmap has to implement equals to check for key
                return head.value;
            head = head.next;
        }
        return null;
    }

    public void put(K key ,  V value){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head != null){
            if (head.key.equals(key)){
                //if entry was found in the map just update the netry;s value with whatever values recieved ion args.
                head.value = value;
                return;
            }
            //else keep on traversing
            head = head.next;
        }
        //if not found increase the size of the bucketArray
        size++;
        MapNode<K,V> newEntry = new MapNode<K,V>(key,value);
        //we get a new head as above bucketsArray head was exhausted and set it to head
        head = bucket.get(bucketIndex);
//       //also set the next of the new entry as the head
        newEntry.next = head;
        bucket.set(bucketIndex,newEntry);

        double loadFactor = (1.0 * size) / capacity;

        System.out.println("inserting key " + key);
        System.out.println("Load Factor : " + loadFactor);
        if(loadFactor > 0.7)
            rehash();
    }
    private void rehash() {
        System.out.println("Rehashing buckets");
        List<MapNode<K , V>> temp = bucket;
        bucket = new ArrayList<>();
        capacity *= 2;
        for(int i = 0 ; i < capacity ; i ++)
            bucket.add(null);
        size = 0;

        for(int i = 0 ; i < temp.size() ; i ++) {
            MapNode<K , V> head = temp.get(i);
            while(head != null) {
                put(head.key , head.value);
                head = head.next;
            }
        }
    }

    public void remove(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        MapNode<K,V> prev = null;
        while(head !=null){
            if (head.key.equals(key)){
                if (prev == null){
                    bucket.set(bucketIndex,head.next);
                }else
                    prev.next = head.next;
                head.next = null;
                size--;
                break;
            }
            prev = head;
            head = head.next;
        }
    }
}
