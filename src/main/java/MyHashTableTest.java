public class MyHashTableTest {

    public static void main(String[] args) {
        MyHashTable<Integer, String> hashTable = new MyHashTable<>();

        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");
        hashTable.put(4, "Four");

        System.out.println("Value for key 1: " + hashTable.get(1));
        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Value for key 3: " + hashTable.get(3));

        System.out.println("Contains value 'Two': " + hashTable.contains("Two"));
        System.out.println("Contains value 'Five': " + hashTable.contains("Five"));

        System.out.println("Key for value 'Three': " + hashTable.getKey("Three"));

        System.out.println("Remove key 2: " + hashTable.remove(2));
        System.out.println("Value for key 2 after removal: " + hashTable.get(2));

        System.out.println("Size of the hash table: " + hashTable.size());
        System.out.println("Is hash table empty? " + hashTable.isEmpty());
    }
}