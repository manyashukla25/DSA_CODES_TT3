import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class TreeViews {
    static class QueueNode {
        TreeNode node;
        int horizontalDistance;

        public QueueNode(TreeNode node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    public static void printTopView(TreeNode root) {
        if (root == null)
            return;

        Map<Integer, Integer> topViewMap = new HashMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode current = queue.poll();
            int horizontalDistance = current.horizontalDistance;
            if (!topViewMap.containsKey(horizontalDistance)) {
                topViewMap.put(horizontalDistance, current.node.val);
            }

            if (current.node.left != null)
                queue.add(new QueueNode(current.node.left, horizontalDistance - 1));
            if (current.node.right != null)
                queue.add(new QueueNode(current.node.right, horizontalDistance + 1));
        }

        // Print the top view
        for (int key : topViewMap.keySet()) {
            System.out.print(topViewMap.get(key) + " ");
        }
        System.out.println();
    }

    public static void printBottomView(TreeNode root) {
        if (root == null)
            return;

        Map<Integer, Integer> bottomViewMap = new HashMap<>();
        Queue<QueueNode> queue = new LinkedList<>();
        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode current = queue.poll();
            int horizontalDistance = current.horizontalDistance;
            bottomViewMap.put(horizontalDistance, current.node.val);

            if (current.node.left != null)
                queue.add(new QueueNode(current.node.left, horizontalDistance - 1));
            if (current.node.right != null)
                queue.add(new QueueNode(current.node.right, horizontalDistance + 1));
        }

        // Print the bottom view
        for (int key : bottomViewMap.keySet()) {
            System.out.print(bottomViewMap.get(key) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        System.out.println("Top View:");
        printTopView(root);

        System.out.println("Bottom View:");
        printBottomView(root);
    }
}
