package com.joy.algos.data;

import org.omg.CORBA.Object;

import java.util.Iterator;

/**
 * 定容栈（泛型实现）
 */
public class FixedCapacityStack<T> implements Iterable<T>{
    private T[] arr;

    private int N;

    @SuppressWarnings("unchecked")
    public FixedCapacityStack(int capacity){
        arr = (T[]) new Object[capacity];
        N = 0;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty(){
        return N == 0;
    }

    /**
     * 获取当前栈的大小
     */
    public int size(){
        return N;
    }

    /**
     * 压入一个元素
     */
    public void push(T element){
        // 若达到数组最大值，扩大一倍数组容量
        if(N == arr.length){
            resize(2 * arr.length);
        }
        arr[N++] = element;
    }

    /**
     * 弹出一个元素
     */
    public T pop(){
        T t = arr[--N];
        // 避免对象有力
        arr[N] = null;
        // 按一半的规律缩短数组
        if(N > 0 && N == arr.length / 4){
            resize(arr.length/2);
        }
        return t;
    }


    /**
     * 支持迭代
     */
    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    private class ReverseIterator implements Iterator<T>{
        private int i = N;
        @Override
        public void remove() {

        }


        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return arr[--i];
        }
    }

    /**
     * 支持扩容、变容
     */
    private void resize(int max){
        // 将元素移动到一个大小为max的新数组
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
