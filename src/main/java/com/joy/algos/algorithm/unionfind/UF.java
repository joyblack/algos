package com.joy.algos.algorithm.unionfind;

public interface UF {
    /**
     * p(0 - N-1)所在的分量标识符
     */
    int find(int p);

    /**
     * 在p和q之间添加一条连接
     */
    void union(int p, int q);

    /**
     * 如果p和q存在同一分量则返回true
     */
    boolean connected(int p, int q);

    /**
     * 连通分量的数量
     */
    int count();

}
