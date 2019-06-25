package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {
    private T data;
    private Node next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public T getData(){
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
