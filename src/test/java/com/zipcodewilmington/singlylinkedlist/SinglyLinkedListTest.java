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

        list.remove(0);
        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(1), list.length());
    }

    @Test
    public void testRemove2(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        list.remove(2);
        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(4), list.length());
    }

    @Test
    public void testRemove3(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        list.remove(list.length() - 1);
        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(4), list.length());
    }

    @Test
    public void testContains(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        System.out.println(list);
        Assert.assertTrue(list.contains("sec"));
    }

    @Test
    public void testContains2(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        System.out.println(list);
        Assert.assertFalse(list.contains("blah"));
    }

    @Test
    public void testFind1(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(1), list.find("sec"));
    }
    @Test
    public void testFind2(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(0), list.find("first"));
    }
    @Test
    public void testFind3(){
        SinglyLinkedList<String> list = new SinglyLinkedList<String>("first");
        list.add("sec");
        list.add("third");
        list.add("four");
        list.add("five");

        System.out.println(list);
        Assert.assertEquals(Integer.valueOf(4), list.find("five"));
    }
}
