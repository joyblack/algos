package com.joy.algos.data;

/**
 * 先进先出队列（链表实现）
 */
public class Queue<T> {
    // 指向最早添加的节点
    private Node first;
    // 指向最新添加的节点
    private Node last;
    // 节点的数量
    private int N;

    /**
     * 节点嵌套类
     */
    private class Node {
        private T item;
        private Node next;
    }

    public boolean isEmpty(){
        return first == null; // return N == 0;
    }

    public int size(){
        return N;
    }

    public void enqueue(T item){
        // 从队尾添加元素
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else{
            oldLast.next = last;
        }
        N ++;
    }

    public T dequeue(){
        // 从队首删除元素
        T item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        N --;
        return item;
    }


}
