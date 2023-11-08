package com.sikku.collection.linkedist;

import java.util.Scanner;

public class LinkedListUse {

    static final Scanner sc = new Scanner(System.in);

    public static Node<Integer> addAll() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void printIth(Node<Integer> head, int index) {
        Node<Integer> temp = head;
        int counter = 0;

        while (temp != null) {

            if (counter == index) {
                System.out.println(temp.data);
                break;
            }
            counter++;
            temp = temp.next;
        }
    }

    public static int size(Node<Integer> head) {
        Node<Integer> temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static Node<Integer> add() {
        System.out.println("Enter Number: ");
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            System.out.println("Enter Number: ");
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> add(Node<Integer> head, Integer num, int index) {
        Node<Integer> temp = head;

        if (index == 0) {
            Node<Integer> currentNode = new Node<>(num);
            currentNode.next = temp;
            head = currentNode;
        } else {
            int counter = 1;
            while (temp != null) {
                if (counter == index) {
                    Node<Integer> currentNode = new Node<>(num);
                    currentNode.next = temp.next;
                    temp.next = currentNode;
                    break;
                }
                temp = temp.next;
                counter++;
            }
        }


        return head;

    }

    public static Node<Integer> takeInput() {
        System.out.println("Enter Number: ");
        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            System.out.println("Enter Number: ");
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {

        Node<Integer> n = takeInput();
        System.out.println();


        print(n);

        System.out.println();

        Node<Integer> n1 = add(n, 50, 3);
//        Node<Integer> n1 = add(n, 89, 0);
        print(n1);
    }
}
