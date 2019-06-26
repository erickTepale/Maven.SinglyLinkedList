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

    public void remove(Integer index){
        Node current = head;
        Integer counter =0;
        while(current != null) {
            if(index.equals(0)){
                head = current.getNext();
                size -= 1;
                break;
            } else if(counter == index - 1){
                if(current.getNext().getNext() == null)
                    current.setNext(null);
                else
                    current.setNext(get(index + 1));

                size-=1;
                break;
            }
            counter++;
            current = current.getNext();
        }
    }

    public Boolean contains(T data){
        Node current = head;
        while(current != null){
            if(current.getData().equals(data)) {
                return true;
            }

            current= (current.getNext());
        }
        return false;
    }

    public Integer find(T data){
        Node current = head;
        Integer counter = 0;
        while(current != null){
            if(current.getData().equals(data)) {
                return counter;
            }
            counter++;
            current= (current.getNext());
        }
        return -1;
    }

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

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                '}';
    }
}
