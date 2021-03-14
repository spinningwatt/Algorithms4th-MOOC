package pers.tan.algorithms.unionFind;

public abstract class UF
{
    public Integer[] objects;
    public Integer groups;
    public UF(int n)
    {
        objects = new Integer[n];
        for (int i=0;i<n;i++)
        {
            objects[i] = i;
        }
        groups = n;
    }

    public abstract void union(int p, int q);
    //public abstract int find(int p);
    public abstract boolean connected(int p, int q);
    public abstract int count();
}
