package pers.tan.algorithms.bagQueuesAndStack;

/**
 * 这个类是FixedCapacityStackOfString的改进版本
 * 主要解决了FixedCapacityStackOfString只能处理固定类型元素的缺陷
 * 解决的方法：使用泛型 Generics
 * @param <Item>
 */
public class FixedCapacityStack<Item>
{
    private final Item[] stack;
    private int number;

    FixedCapacityStack(int cap)
    {
        stack = (Item[]) new Object[cap];
    }

    // Add a new item
    void push(Item item)
    {
        stack[number++] = item;
    }

    // Remove the most recently added item
    Item pop()
    {
        return stack[--number];
    }

    // To check if the stack is empty
    boolean isEmpty()
    {
        return number == 0;
    }

    // To fetch the number of current stack
    int size()
    {
        return number;
    }
}
