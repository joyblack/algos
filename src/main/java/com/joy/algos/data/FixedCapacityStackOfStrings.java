package com.joy.algos.data;

import com.joy.algos.util.StdIn;
import com.joy.algos.util.StdOut;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(20);


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
