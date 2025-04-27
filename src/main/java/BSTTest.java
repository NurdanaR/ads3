public class BSTTest {

    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(10, "Ten");
        bst.put(5, "Five");
        bst.put(15, "Fifteen");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(13, "Thirteen");

        System.out.println("Value for key 10: " + bst.get(10));
        System.out.println("Value for key 5: " + bst.get(5));
        System.out.println("Value for key 13: " + bst.get(13));

        bst.delete(5);
        System.out.println("Value for key 5 after deletion: " + bst.get(5));

        System.out.println("In-order traversal of the BST:");
        for (Integer key : bst.iterator()) {
            System.out.println(key + ": " + bst.get(key));
        }
    }
}