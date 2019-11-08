package com.joy.algos.data;

import java.util.Iterator;

public class Bag<T> implements Iterable<T>{
    private Node first;
    private class Node{
        private T item;
        private Node next;
    }

    public void add(T item){
        // 和stack的push方法完全相同
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    // 支持迭代
    public Iterator<T> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        private Node current = first;

        @Override
        public void remove() {

        }


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }

}
