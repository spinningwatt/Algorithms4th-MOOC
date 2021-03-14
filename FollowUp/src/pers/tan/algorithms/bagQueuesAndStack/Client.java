package pers.tan.algorithms.bagQueuesAndStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Client
{
    public static void main(String[] args)
    {
        Client.ForFixedCapacityStackOfString();
        Client.ForFixedCapacityStack();
        Client.ForResizableStack();
    }

    // For ResizableStack
    private static void ForResizableStack()
    {
        ResizableStack<String> rs;
        rs = new ResizableStack<String>(1);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                rs.push(item);
                StdOut.println("Pushed " + item + " on the stack\t" + "cap:" + rs.capacity());
            } else if (!rs.isEmpty())
            {
                StdOut.println("Popped " + rs.pop() + " out of stack\t" + "cap:" + rs.capacity());
            }
        }
        StdOut.println("(" + rs.size() + " left on stack)");
    }

    // client for FixedCapacityStack<Item>
    private static void ForFixedCapacityStack()
    {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                s.push(item);
            } else if (!s.isEmpty())
            {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }

    // client for FixedCapacityStackOfString
    private static void ForFixedCapacityStackOfString()
    {
        FixedCapacityStackOfString s;
        s = new FixedCapacityStackOfString(100);
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                s.push(item);
            }else if (!s.isEmpty())
            {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
