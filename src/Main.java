import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        BinarySearchTree bst = new BinarySearchTree();
        LinkedList list = new LinkedList();

        Random random = new Random();
        long startTime, endTime;
        for (int i = 0; i < 10000; i++) {
            int randomNumber = random.nextInt(9999);
            bst.insert(randomNumber);
            list.add(randomNumber);
        }
        int searchKey = random.nextInt(9999); //por aquello, la key tambien se genera de manera aleatoria, pero Sí es la misma key para ambos

        startTime = System.nanoTime();
        boolean bstSearchResult = bst.search(searchKey);
        endTime = System.nanoTime();
        System.out.println("BST search time for key " + searchKey + ": " + (endTime - startTime) + " nanoseconds. Result: " + bstSearchResult);

        startTime = System.nanoTime();
        boolean listSearchResult = list.contains(searchKey);
        endTime = System.nanoTime();
        System.out.println("LinkedList search time for key " + searchKey + ": " + (endTime - startTime) + " nanoseconds. Result: " + listSearchResult);

    }
}