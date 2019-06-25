package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node tail;
    private static Integer size;

    public SinglyLinkedList(T head){
        this.head = new Node<T>(head);
        size = 1;
    }

    public void add(T data){
        Node<T> newTail = new Node<T>(data);
        if(size.equals(1)) {
            head.setNext(newTail);
            tail = newTail;
        }
        else {
            tail.setNext(newTail);
            tail = tail.getNext();
        }

        size++;
    }

//    public void remove(Integer index){
//        Node current = head;
//        System.out.println(current);
//        for (int i = 0; i < size; i++) {
//            if(i == index - 1){
//                if(current.getNext().getNext() == null)
//                    current.setNext(null);
//                else
//                    current.setNext(this.get(index + 1));
//
//                break;
//            }
//
//            current = current.getNext();
//        }
//    }

    public Node get(Integer index){
        Node current = head;
        for (int i = 0; i < size; i++) {
            if(i == index)
                return current;
            current = current.getNext();
        }
        return null;
    }

    public Integer length(){
        return size;
    }


}
