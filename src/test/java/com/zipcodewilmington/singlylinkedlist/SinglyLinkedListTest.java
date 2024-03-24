package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void ListTest(){
        LinkedList<String> set1 = new LinkedList<String>();
        set1.addFirst("Hey");
        assertEquals(true, set1.contains("Bob"));

    }
    @Test
    public void TestAddLast(){
        LinkedList<String> set1 = new LinkedList<String>();
        set1.addLast("Bob");
        assertEquals(true, set1.contains("Bob"));
    }
    @Test
    public void TestRemoveFirst(){
        LinkedList<String> set2 = new LinkedList<String>();
        set2.addFirst("Hey");
        set2.addLast("Bob");
        set2.removeFirst();
        assertEquals(false, set2.contains("Hey"));
    }
    @Test
    public void TestRemoveLast(){
        LinkedList<String> set2 = new LinkedList<String>();
        set2.addFirst("Hey");
        set2.addLast("Bob");
        set2.removeLast();
        assertEquals(false, set2.contains("Bob"));
    }
    @Test
    public void TestLinkedListSize() {
        LinkedList<String> set4 = new LinkedList<String>();
        set4.add("Rose");
        set4.addFirst("Joy");
        assertEquals(2, set4.size());
    }

}
