package com.company.listClasses;

public class List<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int count;

    public void createListfromArrey(T[] arrey) {
        for (int i = 0; i < arrey.length; i++) {
            addElementTail(arrey[i]);
        }
    }

    public void empty() {

        if (count == 0) {
            System.out.println("Список пуст!");
        } else {
            System.out.println("Список состоит из " + count + " элементов");
        }
    }

    public void addElementHead(T value) {
        ListNode a = new ListNode();
        a.value = value;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
        count++;
    }

    public void addElementByindex(int index, T value) {
        int number = 1;
        ListNode<T> node = head;
        ListNode<T> nextnode = head.next;

        while (number < index - 1) {
            node = nextnode;
            nextnode = nextnode.next;
            number++;
        }

        ListNode a = new ListNode();
        a.value = value;
        a.next = nextnode;
        node.next = a;
        count++;
    }

    public void addElementTail(T value) {
        ListNode a = new ListNode();
        a.value = value;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        count++;
    }

    public void deleteElementhead() {
        head.value = null;
        head = head.next;
        count--;
    }

    public void deleteElement(T value) {
        if (head == null)
            return;
        if (head == tail) {
            head = null;
            tail = null;
            count--;
            return;
        }

        if (head.value == value) {
            head = head.next;
            count--;
            return;
        }

        ListNode t = head;
        while (t.next != null) {
            if (t.next.value == value) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                count--;
                return;
            }
            t = t.next;
        }
    }

    public void deleteElementbyIndex(int index) {
        int number = 1;
        ListNode<T> node = head;
        ListNode<T> nextnode = head.next;

        while (number < index - 1) {
            node = nextnode;
            nextnode = nextnode.next;
            number++;
        }
        node.next = nextnode.next;
        count--;
    }

    public void deleteElementTail() {
        ListNode<T> node;

        for (node = this.head; node.next.next != null; ) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        count--;
    }

    public void replaceElementsByindex(int Index, int secondIndex) {
        int number = 1;
        ListNode<T> node = head;
        ListNode<T> nextnode = head.next;

        while (number < Index - 1) {
            node = nextnode;
            nextnode = nextnode.next;
            number++;
        }
        ListNode<T> firstNodetoReplace = nextnode.next;

        number = 1;
        ListNode<T> repleceNode = head;
        ListNode<T> nextrepleceNode = head.next;


        while (number < secondIndex - 1) {
            repleceNode = nextrepleceNode;
            nextrepleceNode = nextrepleceNode.next;
            number++;
        }

        ListNode<T> secondNodetoReplace = nextrepleceNode.next;

        node.next = nextrepleceNode;
        nextrepleceNode.next = firstNodetoReplace;
        repleceNode.next = nextnode;
        nextnode.next = secondNodetoReplace;
    }

    public void printList() {
        ListNode i = head;
        while (i != null) {
            System.out.print(i.toString());
            i = i.next;
        }
    }
}
