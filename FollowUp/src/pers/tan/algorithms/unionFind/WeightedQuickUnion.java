package pers.tan.algorithms.unionFind;

public class WeightedQuickUnion extends QuickUnion
{
    private int[] branchSize;
    public WeightedQuickUnion(int n)
    {
        super(n);
        branchSize = new int[n];
        for (int i = 0; i < n; i++)
        {
            branchSize[i] = 1;
        }
    }

    @Override
    public void union(int p, int q)
    {
        if (connected(p,q) || p==q)
        {
            return;
        }
        if (branchSize[root(p)] >= branchSize[root(q)])
        {
            //q更小，把q的root放在p的root下
            objects[root(q)] = root(p);
            // size理论上应该整个树每个节点的size都遍历修改
            // 但是只要改root的size就行，每次查询的时候访问root的size
            branchSize[root(p)] += branchSize[root(q)];
        }else
        {
            objects[root(p)] = root(q);
            branchSize[root(q)] += branchSize[root(p)];
        }
        groups--;
    }
}
