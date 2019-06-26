package com.zipcodewilmington.singlylinkedlist;

import java.util.Objects;

public class Node<T>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
