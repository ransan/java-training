package algorithm.LinkedList;

import algorithm.LinkedList.config.ListNode;

import java.util.List;

public class SinglyLinkedList {
    ListNode head;
    private int length;

    public SinglyLinkedList() {
        length = 0;
    }

    public synchronized ListNode getHead() {
        return head;
    }

    public synchronized void insertAtBegin(ListNode listNode) {
        listNode.next = head;
        head = listNode;
        length++;
    }

    public synchronized void insertAtEnd(ListNode listNode) {
        if (head == null) {
            head = listNode;
        }
        ListNode firstNode = null;
        ListNode nextNode;
        for (listNode = head; (nextNode = firstNode.getNext()) != null ; firstNode= nextNode) {
            firstNode.setNext(listNode);
        }
        length++;
    }

    public synchronized void insertAtPosition(int data, int position) {
        if (position < 0){
            position = 0;
        }
        if (position > length){
            position = length;
        }
        if (head == null) {
            head = new ListNode(data);
        } else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        } else {
            ListNode temp = head;
            for (int i=1;i<position;i++) {
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public synchronized ListNode removeAtFront() {
        ListNode node = head;
        if (node != null) {
            head = node.next;
            node.setNext(null);
        }
        return node;
    }
}
