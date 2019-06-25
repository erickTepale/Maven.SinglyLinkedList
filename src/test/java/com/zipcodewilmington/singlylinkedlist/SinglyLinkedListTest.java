package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void testConstructor(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        Assert.assertEquals(Integer.valueOf(1), list.length());
    }

    @Test
    public void testAdd(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        Assert.assertEquals(Integer.valueOf(1), list.length());

        list.add("bleh");
        Assert.assertEquals(Integer.valueOf(2), list.length());

        list.add("bleh");
        list.add("bleh");
        list.add("bleh");
        list.add("bleh");
        list.add("bleh");

        Assert.assertEquals(Integer.valueOf(7), list.length());
    }

    @Test
    public void testGet(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("bleh");

        Node a = list.get(0);
        Assert.assertEquals("first", a.getData());
    }

    @Test
    public void testGet2(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("bleh");

        Node a = list.get(1);
        Assert.assertEquals("bleh", a.getData());
    }

    @Test
    public void testRemove(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("bleh");
        list.add("blah");
        list.add("blehsd");

        list.remove(1);
        Assert.assertEquals(Integer.valueOf(1), list.length());
    }
}
