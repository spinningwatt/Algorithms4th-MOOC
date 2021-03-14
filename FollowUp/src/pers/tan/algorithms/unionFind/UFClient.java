package pers.tan.algorithms.unionFind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UFClient
{
    public static void main(String[] args)
    {
        // Quick-Find
//        int N = StdIn.readInt();
//        QuickFind qf = new QuickFind(N);
//        while (!StdIn.isEmpty())
//        {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!qf.connected(p, q)) {
//                qf.union(p, q);
//                StdOut.println(p + " " + q);
//            }
//        }
//        StdOut.println(qf.count() + " components left.");

        // Quick-Union
//        int N = StdIn.readInt();
//        QuickUnion qu = new QuickUnion(N);
//        while (!StdIn.isEmpty())
//        {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!qu.connected(p, q))
//            {
//                qu.union(p, q);
//                StdOut.println(p + " " + q);
//            }
//        }
//        StdOut.println(qu.count() + " components left.");

        // Weighted Quick-Union
//        int N = StdIn.readInt();
//        WeightedQuickUnion wqu = new WeightedQuickUnion(N);
//        while (!StdIn.isEmpty())
//        {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!wqu.connected(p, q))
//            {
//                wqu.union(p, q);
//                StdOut.println(p + " " + q);
//            }
//        }
//        StdOut.println(wqu.count() + " components left.");

        // Weighted Quick-Union with Path compression
        int N = StdIn.readInt();
        PCWeightedQuickUnion pcwqu = new PCWeightedQuickUnion(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!pcwqu.connected(p, q))
            {
                pcwqu.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
        StdOut.println(pcwqu.count() + " components left.");
    }
}
