import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15 {

    public static Node insert(Node head, int data) {
//        Complete this method
//        Solution 1
//        if (head == null) return new Node(data);
//        else if(head.next == null) head.next = new Node(data);
//        else insert(head.next, data);
//        return head;
//        Solution 2
        if (head == null) return new Node(data);
        Node newNode = new Node(data);
        Node currentNode = head;
        while (true) {
            if (currentNode.next != null) {
                currentNode = currentNode.next;
            } else {
                currentNode.next = newNode;
                break;
            }
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}