package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Nodes head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public class Nodes {
        Integer data;
        Nodes next;

        public Nodes(Integer data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();

        //Operations
        list.addFirst(12);
        list.addLast(20);
        list.addLast(3);
        list.addFirst(5);
        list.println();
        System.out.println(list.currentSize());
        list.remove(0);
        list.println();
        list.getAtIndex(0);
        System.out.println(list.findIndex(3));
        System.out.println(list.currentSize());
        System.out.println(list.checkTheData(20));
        list.sort();
        list.println();
        list.copyList();

    }

    public void addFirst(Integer data) {
        Nodes node = new Nodes(data);
        if (head == null) {
            head = node;
            head.next = null;
        }
        node.next = head;
        head = node;
    }

    public void addLast(Integer data) {
        Nodes node = new Nodes(data);
        if (head == null) {
            head = node;
            return;
        }
        Nodes currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;

    }


    public void remove(int index) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while (tempNode != null) {
            if (currentIndex == index - 1) {
                tempNode.next = tempNode.next.next;
                size--;
                break;
            }
            currentIndex++;
        }

    }

    public Integer getAtIndex(int index) {
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while (tempNode != null) {
            if (currentIndex == index) {
                return tempNode.data;
            }

            currentIndex++;
            tempNode = tempNode.next;
        }
        return null;

    }

    public boolean checkTheData(Integer data) {
        Nodes tempNode = head;
        //Integer currentIndex = 0;
        while (tempNode != null) {
            if (tempNode.data == data) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public Integer findIndex(Integer data) {
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while (tempNode != null) {
            if (tempNode.data == data) {
                return currentIndex;
            }

            currentIndex++;
            tempNode = tempNode.next;
        }
        return -1;
    }

    public Integer currentSize() {
        return size;
    }
//    public void sortList(){
//        Nodes currentNode = head;
//        Nodes index = null;
//        Integer temp;
//        if(head == null){
//            return;
//        }
//        else{
//            while(currentNode != null){
//                index = currentNode.next;
//
//                while(index != null){
//                    if(currentNode.data > index.data){
//                        temp = currentNode.data;
//                        currentNode.data = index.data;
//                        index.data = temp;
//                    }
//                index = index.next;
//                }
//            currentNode = currentNode.next;
//            }
//        }
//    }

    public void sort() {
        Nodes current = head;
        Nodes index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public SinglyLinkedList copyList(){
        SinglyLinkedList list2 = new SinglyLinkedList();
        Nodes current = head;
        while(current !=null){
            list2.addLast(current.data);
            current = current.next;
        }
        return list2;
    }
    public void println() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Nodes currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
}



