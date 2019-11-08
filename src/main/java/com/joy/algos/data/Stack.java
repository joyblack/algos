package com.joy.algos.data;

public class Stack<T> {
    // 栈顶
    private Node first;
    // 元素数量
    private int N;

    private class Node{
        T item;
        Node next;
    }

    public boolean isEmpty(){
        return N == 0;// return first == null;
    }

    public int size(){
        return N;
    }

    // 向栈顶添加元素
    public void push(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N ++;
    }

    // 栈顶弹出元素
    public T pop(){
        T item = first.item;
        first = first.next;
        N --;
        return item;
    }

    // 支持遍历...
}
