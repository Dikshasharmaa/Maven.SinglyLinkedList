package com.zipcodewilmington.singlylinkedlist;


import org.w3c.dom.Node;

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
        String data;
        Nodes next;

        public Nodes(String data) {
            this.data = data;
            this.next = null;
            size ++;
        }
    }
        public static void main(String args[]){
            SinglyLinkedList list = new SinglyLinkedList();
            //Operations
            list.addFirst("Hey");
            list.addLast("Bob");
            list.println();
            System.out.println(list.currentSize());
            list.remove(1);
            list.println();
            list.getAtIndex(0);
            System.out.println(list.findIndex("Hey"));
            System.out.println(list.currentSize());
            System.out.println(list.checkTheData("Bob"));

        }
        public void addFirst(String data){
        Nodes node = new Nodes(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
        //size++;
        }
    public void addLast(String data){
        Nodes node = new Nodes(data);
        if(head == null){
            head = node;
            return;
        }
        Nodes currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        //size ++;
    }



    public void remove(int index){
        if(head == null){
            System.out.println("List is empty");
        }
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while(tempNode != null){
            if(currentIndex == index-1){
                tempNode.next = tempNode.next.next;
                size --;
                break;
            }
            currentIndex++;
        }

    }

    public void getAtIndex(int index){
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while(tempNode != null){
            if(currentIndex == index){
                System.out.println(tempNode.data);
                break;
            }
            else {
                System.out.println("List is empty");
            }
            currentIndex++;
        }

    }

    public boolean checkTheData(String data){
        Nodes tempNode = head;
        //Integer currentIndex = 0;
        while(tempNode != null){
            if(tempNode.data == data){
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public Integer findIndex(String data){
        Nodes tempNode = head;
        Integer currentIndex = 0;
        while(tempNode != null){
            if(tempNode.data == data){
                return currentIndex;
            }

            currentIndex++;
            tempNode = tempNode.next;
        }
        return -1;
    }
    public Integer currentSize(){
        return size;
    }
    public void println(){
        if(head == null){
            System.out.println("List is empty");
        }
        Nodes currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }



    }

