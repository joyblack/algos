package com.joy.algos.algorithm.unionfind;

import com.joy.algos.util.StdIn;

public class Test {
//    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        UF uf = new QuickFindUF(N);
//        while(!StdIn.isEmpty()){
//            // 解决由StdIn的二到的动态连通性问题
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//
//            // 若p、q连通
//            if(uf.connected(p,q)){
//                System.out.println(p + "和" + q + "是连通的。");
//            }else{
//                uf.union(p, q);
//                // 打印连接
//                System.out.println(p + " => " + q);
//            }
//        }
//
//        System.out.println("分量个数： " + uf.count());
//    }

//    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        UF uf = new QuickUnionUF(N);
//        while(!StdIn.isEmpty()){
//            // 解决由StdIn的二到的动态连通性问题
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//
//            // 若p、q连通
//            if(uf.connected(p,q)){
//                System.out.println(p + "和" + q + "是连通的。");
//            }else{
//                uf.union(p, q);
//                // 打印连接
//                System.out.println(p + " => " + q);
//            }
//        }
//
//        System.out.println("分量个数： " + uf.count());
//    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new WeightedQuickUnionUF(N);
        while(!StdIn.isEmpty()){
            // 解决由StdIn的二到的动态连通性问题
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            // 若p、q连通
            if(uf.connected(p,q)){
                System.out.println(p + "和" + q + "是连通的。");
            }else{
                uf.union(p, q);
                // 打印连接
                System.out.println(p + " => " + q);
            }
        }

        System.out.println("分量个数： " + uf.count());
    }
}
