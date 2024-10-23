public class binary_search_tree {
    public static class TreeNode {
        private final int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }
    private TreeNode root = null;

    public void insert(int value) {
        TreeNode newTreeNode = new TreeNode(value);

        if (root == null) {
            root = newTreeNode;
        }
        else {
            TreeNode temp = root;
            while (true) {
                if (value <= temp.val) {
                    if (temp.left == null) {
                        temp.left = newTreeNode;
                        break;
                    }
                    else {
                        temp = temp.left;
                    }
                }
                else {
                    if (temp.right == null) {
                        temp.right = newTreeNode;
                        break;
                    }
                    else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }


    public static void main(String[] args) {
        binary_search_tree tree = new binary_search_tree();
        tree.insert(11);
        tree.insert(10);
        tree.insert(3);
        tree.insert(4);
        tree.insert(9);
        tree.insert(22);
        tree.insert(45);
        tree.insert(20);
        tree.insert(20);

        tree.inorder(tree.root);
    }
}
