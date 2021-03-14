package pers.tan.algorithms.unionFind;

public class PCWeightedQuickUnion extends WeightedQuickUnion
{
    public PCWeightedQuickUnion(int n)
    {
        super(n);
    }

    @Override
    // 查询节点的根节点
    protected int root(int i)
    {
        while(i != objects[i])
        {
            objects[i] = objects[objects[i]];
            i = objects[i];
        }
        return i;
    }
}
