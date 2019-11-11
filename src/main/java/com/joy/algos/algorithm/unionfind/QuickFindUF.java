package com.joy.algos.algorithm.unionfind;


public class QuickFindUF implements UF {

    // 分量id（以触点作为索引）
    private int[] id;

    // 分量的数量（分量就是一个连通的树族）
    private int count;

    public QuickFindUF(int N){
        // 初始化分量数组,初始状态下，分量的数量即为数组个数，他们之间互不连通
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            // 代表触点为i的点的分量id为多少，初始状态下，是自身。
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        // 将p和q放入相同的连通分量中
        int pId = find(p);
        int qId = find(q);

        // 如果p和q已经在相同的分量之中弄则不需要采取任何行动,
        // 否则：
        // 1. 将p的分量(所有的连通触点对应的值-分量)重命名为q的名称（反过来也行）
        // 2. 连通分量的数量 -1.
        if(pId != qId){
            for (int i = 0; i < id.length; i++) {
                if(id[i] == pId){
                    id[i] = qId;
                }
            }
            count --;
        }
    }

    @Override
    public int find(int p) {
        // 直接返回触点对应的值，即为他的连通分量值。
        return id[p];
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
