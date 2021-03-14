package pers.tan.algorithms.bagQueuesAndStack;

import java.util.Iterator;

/**
 * 本类在FixedCapacityStack的基础上解决了栈长度固定的问题
 */
public class ResizableStack<Item> implements Iterable<Item>
{
    private Item[] stack;
    private int number;

    public ResizableStack(int cap)
    {
        stack = (Item[]) new Object[cap];
        number = 0;
    }

    private void resize(int max)
    {
        Item[] tmp = (Item[]) new Object[max];
        for (int i = 0; i<number; i++)
        {
            tmp[i] = stack[i];
        }
        stack = tmp;
    }

    public void push(Item item)
    {
        if (number == stack.length)
        {
            resize(2*number);
        }
        stack[number++] = item;
    }

    public Item pop()
    {
        Item tmp = stack[--number];
        if (stack.length/4 == number && number > 0)
        {
            resize(stack.length/2);
        }
        return tmp;
    }

    public Item peek()
    {
        return stack[number-1];
    }

    public boolean isEmpty()
    {
        return number == 0;
    }

    // 返回现有元素的个数
    public int size()
    {
        return number;
    }

    // 返回栈的容量
    public int capacity()
    {
        return stack.length;
    }

    @Override
    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = number;

        @Override
        public boolean hasNext()
        {
            return i>0;
        }

        @Override
        public Item next()
        {
            return stack[--i];
        }

        @Override
        public void remove()
        {

        }
    }
}
