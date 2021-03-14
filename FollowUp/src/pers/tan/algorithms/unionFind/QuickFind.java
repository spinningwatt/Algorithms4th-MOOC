package pers.tan.algorithms.unionFind;

public class QuickFind extends UF
{
    public QuickFind(int n)
    {
        super(n);
    }

    @Override
    public void union(int p, int q)
    {
        if (objects[p]==objects[q])
        {
            return;
        }
        int pid = objects[p];
        int qid = objects[q];
        for (int i=0; i<objects.length; i++)
        {
            if (objects[i] == pid)
            {
                objects[i] = qid;
            }
        }
        groups --;
    }

    public int find(int p)
    {
        return objects[p];
    }

    @Override
    public boolean connected(int p, int q)
    {
        return (objects[p] == objects[q]);
    }

    @Override
    public int count()
    {
        return groups;
    }

}
