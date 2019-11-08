package com.joy.algos.data;

/**
 * 定容栈（只支持字符串）
 */
public class FixedCapacityStackOfStrings {
    private String[] arr;

    private int N;

    public FixedCapacityStackOfStrings(int capacity){
        arr = new String[capacity];
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
    public void push(String element){
        arr[N++] = element;
    }

    /**
     * 弹出一个元素
     */
    public String pop(){
        return arr[-- N];
    }




}
