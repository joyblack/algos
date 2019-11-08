package com.joy.algos.data;

import com.joy.algos.util.StdIn;
import com.joy.algos.util.StdOut;

public class Test {
//    public static void main(String[] args) {
//        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(20);
//        while(!StdIn.isEmpty()){
//            String ele = StdIn.readString();
//            if(!ele.equals("-")){
//                stack.push(ele);
//            }else if(!stack.isEmpty()){
//                StdOut.print(stack.pop() + " ");
//            }
//        }
//        StdOut.println("栈中剩余元素个数: " + stack.size());
//
//    }

//    public static void main(String[] args) {
//        FixedCapacityStack<String> stack = new FixedCapacityStack(20);
//
//
//        while(!StdIn.isEmpty()){
//            String ele = StdIn.readString();
//            if(ele.equals("-")){
//                StdOut.println(stack.pop() + " ");
//            }else if(ele.equals("+")){
//                for (String s : stack) {
//                    System.out.println(s);
//                }
//            }else {
//                stack.push(ele);
//            }
//        }
//
//        StdOut.println("栈中剩余元素个数: " + stack.size());
//
//    }

//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//
//
//        while(!StdIn.isEmpty()){
//            String ele = StdIn.readString();
//            if(ele.equals("-")){
//                StdOut.println(stack.pop());
//            }else {
//                stack.push(ele);
//            }
//        }
//
//        StdOut.println("栈中剩余元素个数: " + stack.size());
//
//    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        while(!StdIn.isEmpty()){
            String ele = StdIn.readString();
            if(ele.equals("-")){
                StdOut.println(queue.dequeue());
            }else {
                queue.enqueue(ele);
            }
        }

        StdOut.println("栈中剩余元素个数: " + queue.size());

    }
}
