public class BinarySearchTree {
    NodeBST root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(NodeBST root, int key) {
        if (root == null || root.key == key)
            return root != null;
        if (root.key < key)
            return searchRecursive(root.right, key);
        return searchRecursive(root.left, key);
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    private NodeBST insertRecursive(NodeBST root, int key) {
        if (root == null) {
            root = new NodeBST(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRecursive(root.left, key);
        else if (key > root.key)
            root.right = insertRecursive(root.right, key);

        return root;
    }
}
