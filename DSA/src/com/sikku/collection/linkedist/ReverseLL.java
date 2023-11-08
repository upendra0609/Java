package com.sikku.collection.linkedist;

public class ReverseLL {

    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> finalHead = reverse(head.next);
        Node<Integer> temp = finalHead;

        while (temp != null) {
            if (temp.next == null) {
                temp.next = head;
                head.next = null;
            }
            temp = temp.next;
        }
        return finalHead;
    }

    public static void main(String[] args) {
        Node<Integer> n = LinkedListUse.add();
        LinkedListUse.print(n);

        System.out.println();
        Node<Integer> n2 = reverse(n);
        LinkedListUse.print(n2);

    }
}
