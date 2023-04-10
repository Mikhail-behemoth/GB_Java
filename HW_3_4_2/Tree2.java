package HW_3_4_2;

import HW_3_4_2.SimpleQueue;
import HW_3_4_2.SimpleStack;

public class Tree2 {
    public static void main(String[] params) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Количество листьев в дереве: " + countWide(root));
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
    }

    public static int countWide(Tree root) {
        SimpleQueue<Tree> stack = new SimpleQueue<>();
        stack.add(root);

        int count = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();

            System.out.println(node.value);

            if (node.left == null && node.right == null) {
                count++;
            }

            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return count;
    }
}