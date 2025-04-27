public class Main {

    public static void main(String[] args) {
        System.out.println("Testing MyHashTable:");
        MyHashTable<Integer, String> hashTable = new MyHashTable<>();
        hashTable.put(1, "Apple");
        hashTable.put(2, "Banana");
        hashTable.put(3, "Cherry");
        System.out.println("Value for key 1: " + hashTable.get(1));
        System.out.println("Contains value 'Banana': " + hashTable.contains("Banana"));

        System.out.println("\nTesting BST:");
        BST<Integer, String> bst = new BST<>();
        bst.put(10, "Ten");
        bst.put(5, "Five");
        bst.put(15, "Fifteen");
        System.out.println("Value for key 10: " + bst.get(10));
        bst.delete(10);
        System.out.println("Value for key 10 after deletion: " + bst.get(10));
    }
}