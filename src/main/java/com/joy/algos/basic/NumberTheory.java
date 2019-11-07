package com.joy.algos.basic;

public class NumberTheory {

    /**
     * 获取最大公约数
     * @param p 数字p
     * @param q 数字q
     * @return 最大公约数
     */
    public static long gcd(long p, long q){
        if(q == 0){
            return p;
        }
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(gcd(1,0));
    }

}
