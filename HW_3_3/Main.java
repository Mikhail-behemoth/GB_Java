package HW_3_3;

import java.util.ArrayList;

public class Main {

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))); // 1 -> 2 -> 3 -> 4
        size(node);
        iterate(node);
        iterate2(node);
        getbyindex(node, 2);
    }

    static void size(ListNode node) {
        ListNode iter = node;
        int counter = 0;
        while (iter != null) {
            counter++;
            iter = iter.next;
        }
        System.out.println(counter);
    }

    static void iterate(ListNode node) {
        ListNode iter = node;
        while (iter != null) {
            System.out.print(iter.value + " -> ");
            iter = iter.next;
        }
        System.out.println("null");
    }

    static void iterate2(ListNode node) {
        ListNode iter = node;
        ArrayList<String> list = new ArrayList<String>();
        while (iter != null) {
            list.add(iter.value + " -> ");
            iter = iter.next;
        }
        list.add("null");
        System.out.println(list);
    }

    static void getbyindex(ListNode node, int value) {
        ListNode iter = node;
        int counter = 0;
        while (iter != null) {
            if (counter == value) {
                System.out.println(iter.value);
                break;
            } 
            counter++;
            iter = iter.next;
        }
    }
}