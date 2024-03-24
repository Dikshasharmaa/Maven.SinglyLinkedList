package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void ListTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expected = 12;
        list.addFirst(12);
        Integer actual = list.getAtIndex(0);
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void TestAddLast(){
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expected = 5;
        list.addLast(5);
        Integer actual = list.getAtIndex(0);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestRemoveFirst(){
        SinglyLinkedList list = new SinglyLinkedList();
        boolean expected = false;
        list.remove(0);
        Assert.assertEquals(expected,list.checkTheData(12));
    }

    @Test
    public void TestLinkedListSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expected = 1;
        list.addLast(5);
        Integer actual = list.currentSize();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestDataFind() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expected = 0;
        list.addLast(5);
        list.addFirst(10);
        Integer actual = list.findIndex(10);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestSort() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(5);
        list.addFirst(10);
        list.addLast(2);
        list.sort();
        Integer expected0 = 2;
        Integer expected1 = 5;
        Integer expected2 = 10;
        Assert.assertEquals(expected0, list.getAtIndex(0));
        Assert.assertEquals(expected1, list.getAtIndex(1));
        Assert.assertEquals(expected2, list.getAtIndex(2));

    }
    @Test
    public void TestNewList() {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list.addLast(5);
        list.addFirst(10);
        list.addLast(2);
        list2 = list.copyList();

        Assert.assertEquals(list.getAtIndex(0), list2.getAtIndex(0));
        Assert.assertEquals(list.getAtIndex(1), list2.getAtIndex(1));
        Assert.assertEquals(list.getAtIndex(2), list2.getAtIndex(2));

    }



}
