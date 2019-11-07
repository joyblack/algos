package com.joy.algos.data;

import com.joy.algos.util.StdIn;
import com.joy.algos.util.StdOut;

/**
 * 定容栈（泛型实现）
 */
public class FixedCapacityStack<T> {
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
        arr[N++] = element;
    }

    /**
     * 弹出一个元素
     */
    public T pop(){
        return arr[-- N];
    }

    public static void main(String[] args) {
        FixedCapacityStack stack = new FixedCapacityStack(20);


        while(!StdIn.isEmpty()){
            String ele = StdIn.readString();
            if(!ele.equals("-")){
                stack.push(ele);
            }else if(!stack.isEmpty()){
                StdOut.print(stack.pop() + " ");
            }
        }

        StdOut.println("栈中剩余元素个数: " + stack.size());

    }


}
