package com.joy.algos.algorithm.unionfind;

/**
 * 最基本，无任何优化的UF算法
 */
public class WeightedQuickUnionUF implements UF {

    // 父链接数组
    private int[] id;

    // 各个根节点所对应的分量大小
    private int[] sz;


    // 分量的数量（分量就是一个连通的树族）
    private int count;

    public WeightedQuickUnionUF(int N){
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;// 初始状态小分量大小都为1
        }
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        if(i != j){
            // 将小树的根节点连接到大树的根节点
            if(sz[i] < sz[j]){
                id[i] = j;
                sz[j] += sz[i];
            }else{
                id[j] = i;
                sz[i] += sz[j];
            }
            count --;
        }
    }

    @Override
    public int find(int p) {
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        // 若p和q指向同一连通分量，则说明他们之间互相连通。
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
