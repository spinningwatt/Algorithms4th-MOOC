package pers.tan.algorithms.bagQueuesAndStack;

/**
 * 这个类实现栈的功能
 * 保持栈的基本特点：先进后出 pushdown stack
 * 但是以下实现有几点缺陷：
 * 1、固定长度，在对象实例化之后栈的长度不变
 * 2、固定类型，仅用于对string操作
 */
public class FixedCapacityStackOfString
{
    private final String[] stack; // 栈的实体
    private int number;     // 栈的当前元素数量

    // Create a empty stack of capacity cap
    FixedCapacityStackOfString(int cap)
    {
        stack = new String[cap];
    }

    // Add a string
    void push(String item)
    {
        stack[number++] = item;
    }

    // Remove the most recently added string
    String pop()
    {
//        String temp = stack[--number];
//        stack[number] = null;
//        return temp;
        return stack[--number];
    }

    // To check if the stack is empty
    boolean isEmpty()
    {
        return number == 0;
    }

    // To fetch the number of strings on the stack
    int size()
    {
        return number;
    }

    // 判断当前栈是否已被占满
    public boolean isFull()
    {
        return stack.length == number;
    }
}
