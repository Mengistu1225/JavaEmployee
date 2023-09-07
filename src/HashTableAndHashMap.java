
import java.util.*;

public class HashTableAndHashMap {

    public static void main(String[] args) {
        // Create a HashTable
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        // Add some key-value pairs to the HashTable
        hashTable.put("Amit", 100);
        hashTable.put("Vijay", 200);
        hashTable.put("Rahul", 300);

        // Get the value for the key "Amit"
        Integer amitScore = hashTable.get("Amit");
        System.out.println("Amit's score: " + amitScore);

        // Check if the key "Rohan" exists in the HashTable
        boolean isRohanPresent = hashTable.containsKey("Rohan");
        System.out.println("Is Rohan present? " + isRohanPresent);

        // Iterate over the HashTable and print all the key-value pairs
        for (String key : hashTable.keySet()) {
            Integer value = hashTable.get(key);
            System.out.println(key + " : " + value);
        }

        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hashMap.put("Amit", 100);
        hashMap.put("Vijay", 200);
        hashMap.put("Rahul", 300);

        // Get the value for the key "Amit"
        Integer amitScore2 = hashMap.get("Amit");
        System.out.println("Amit's score: " + amitScore2);

        // Check if the key "Rohan" exists in the HashMap
        boolean isRohanPresent2 = hashMap.containsKey("Rohan");
        System.out.println("Is Rohan present? " + isRohanPresent2);

        // Iterate over the HashMap and print all the key-value pairs
        for (String key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }
    }
}

