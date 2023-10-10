package org.example;

import javax.swing.tree.TreeNode;
import java.util.*;

public class DirectionsGame {

    public int[][] solution(int[][] nodeInfo) {

        TreeNode[] nodes = new TreeNode[nodeInfo.length];

        for (int i = 0; i < nodeInfo.length; i++) {
            nodes[i] = new TreeNode(nodeInfo[i][0], i + 1, nodeInfo[i][1]);
        }

        Arrays.sort(nodes, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                if (o1.level == o2.level)
                    return o1.val - o2.val;
                else
                    return o2.level - o1.level;
            }
        });

        TreeNode root = nodes[0];

        for (int i = 1; i < nodes.length; i++) {
            insertNode(root, nodes[i]);
        }


        int[] preOrderResult = preOrderTraversal(root, new ArrayList<>());
        int[] postOrderResult = postOrderTraversal(root, new ArrayList<>());

        int[][] result = new int[2][];
        result[0] = preOrderResult;
        result[1] = postOrderResult;

        return result;
    }

    public int[] preOrderTraversal(TreeNode node, List<Integer> arr) {

        if (node == null)
            return null;


        arr.add(node.number);
        preOrderTraversal(node.left, arr);
        preOrderTraversal(node.right, arr);

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] postOrderTraversal(TreeNode root, List<Integer> arr) {

        if (root == null)
            return null;

        postOrderTraversal(root.left, arr);
        postOrderTraversal(root.right, arr);
        arr.add(root.number);

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    static class TreeNode {
        int val;
        int level;
        TreeNode left;
        TreeNode right;
        int number;

        public TreeNode(int val, int number, int level) {
            this.val = val;
            this.level = level;
            this.left = null;
            this.right = null;
            this.number = number;
        }
    }

    public void insertNode(TreeNode parent, TreeNode child) {

        if (parent.val > child.val) {
            if (parent.left == null)
                parent.left = child;
            else
                insertNode(parent.left, child);
        } else {
            if (parent.right == null)
                parent.right = child;
            else
                insertNode(parent.right, child);
        }
    }
}
