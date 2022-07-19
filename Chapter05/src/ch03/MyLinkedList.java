package ch03;

public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode;
        if (head == null) {
            newNode = new MyListNode(data);
            head = newNode;
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = newNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(String data, int position) {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null;

        MyListNode newNode = new MyListNode(data);

        if (position < 0 || position > count) {
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for (i=0; i<position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    // public MyListNode removeElement(int position) {
    //
    // }

    // public String getElement(int position) {
    //
    // }
}
