import java.io.*;
import java.util.Scanner;

class TreeNode {
    TreeNode left, right;
    int data;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day22 {

    public static int getHeight(TreeNode root) {
        //Write your code here
        int heightLeft = 0;
        int heightRight = 0;
        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }
        return Math.max(heightLeft, heightRight);
    }

    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        TreeNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}