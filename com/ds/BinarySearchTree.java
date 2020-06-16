package com.ds;

public class BinarySearchTree {
    public static void main(String[] args) {
        BST t = new BST();
        t.root = t.insert(t.root, 15);
        t.root = t.insert(t.root, 10);
        t.root = t.insert(t.root, 20);
        t.root = t.insert(t.root, 25);
        t.root = t.insert(t.root, 8);
        t.root = t.insert(t.root, 12);
        t.root = t.insert(t.root, 18);
        t.printLevelOrder();
        System.out.println(t.search(t.root, 18));
    }

}

class TNode {
    int data;
    TNode left;
    TNode right;
}

class BST {
    TNode root;

    public TNode insert(TNode root, int data) {
        if (root == null) {
            root = getNewNode(data);
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(TNode root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data <= root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public int height(TNode root) {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    void printGivenLevel(TNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    TNode getNewNode(int data) {
        TNode n = new TNode();
        n.data = data;
        return n;
    }
}