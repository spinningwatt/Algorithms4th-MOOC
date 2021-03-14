package pers.tan.algorithms.unionFind;

public class QuickUnion extends UF
{
    public QuickUnion(int n)
    {
        super(n);
    }

    // 查询节点的根节点
    protected int root(int i)
    {
        while(i != objects[i])
        {
            i = objects[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q)
    {
        if (connected(p,q))
        {
            return;
        }
        objects[root(p)] = root(q);
        groups--;
    }

    @Override
    public boolean connected(int p, int q)
    {
        return (root(p) == root(q));
    }

    @Override
    public int count()
    {
        return groups;
    }
}
