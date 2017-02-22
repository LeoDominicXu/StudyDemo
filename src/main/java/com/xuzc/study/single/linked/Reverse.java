package com.xuzc.study.single.linked;

/**
 * @Description: The description of the file.
 * @Author: Lagou
 * @Date: 2017/2/22
 */
public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        Node head = new Node();
        Node head1 = head;
        int size = 0;
        reverse.initSingleLinked(head, size);
        while (head.getNext() != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
        System.out.println("------------------反转后-------------------");
        Node headNew = reverse.reverseSingleLinked(head1);
        while (headNew.getNext() != null) {
            System.out.println(headNew.getValue());
            headNew = headNew.getNext();
        }
    }

    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    private Node reverseSingleLinked(Node current) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (current == null || current.getNext() == null) {
            return current;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = reverseSingleLinked(current.getNext());// 先反转后续节点head.getNext()
        current.getNext().setNext(current);// 将当前结点的指针域指向前一结点
        current.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

    private void initSingleLinked(Node node, int i) {
        node.setValue("node" + i);
        Node next = new Node();
        node.setNext(next);
        i++;
        if(i < 10){
            initSingleLinked(next, i);
        }
    }

    static class Node {
        String value;
        Node next;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
