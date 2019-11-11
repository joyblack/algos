package com.joy.algos.algorithm.unionfind;

public class QuickUnionUF implements UF{

    // 分量id（以触点作为索引）
    private int[] id;

    // 分量的数量（分量就是一个连通的树族）
    private int count;

    public QuickUnionUF(int N){
        // 初始化分量数组,初始状态下，分量的数量即为数组个数，他们之间互不连通
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            // 代表触点为i的点的分量id为多少，初始状态下，是自身。
            id[i] = i;
        }
    }

    @Override
    public int find(int p) {
        // 找出分量的名称
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        // 将p和q的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        // 只需修改根节点的连通分量即可
        if(pRoot != qRoot){
            id[pRoot] = qRoot;
            count --;
        }

    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }

    @Override
    public int count() {
        return count;
    }
}
