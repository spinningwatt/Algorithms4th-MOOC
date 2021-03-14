package pers.tan.algorithms.exercises.bagsQueuesAndStack;

import pers.tan.algorithms.bagQueuesAndStack.*;

/**
 * @Question 1.3.4
 * Write a stack a client Parentheses that reads in a text stream from standard input
 * and uses a stack to determine whether its parentheses are properly balanced. For
 * example, your program should print true for [()]{}{[()()]()} and false for [(]).
 *
 * @Solution
 * 每次读入的括号与上一个如果可以组成一对，则弹出上一个符号，结束后如果栈为空则为true
 *
 * @Crew
 * Parentheses.java
 * ParenthesesBalancer.java
 */
public class ParenthesesBalancer
{
    private ResizableStack<Character> parenSeq;

    public ParenthesesBalancer()
    {
        // 默认生成的长度为20
        parenSeq = new ResizableStack<Character>(20);
    }
    public ParenthesesBalancer(int cap)
    {
        parenSeq = new ResizableStack<Character>(cap);
    }

    public void AddParenthesis(Character paren)
    {
        if (parenSeq.isEmpty())
        {
            parenSeq.push(paren);
            return;
        }
        // 先弹出作为判断参考
        Character ref = parenSeq.pop();
        if (isMatched(paren, ref))
        {
            return;
        }else
        {
            parenSeq.push(ref);
            parenSeq.push(paren);
        }
    }

    public boolean isBalanced()
    {
        return parenSeq.isEmpty();
    }

    private boolean isMatched(Character tbd, Character ref)
    {
        if (tbd == '(' || tbd == '[' || tbd =='{')
        {
            // 必对不上
            return false;
        }
        if (ref == '(' && tbd == ')')
        {
            return true;
        }
        if (ref == '[' && tbd == ']')
        {
            return true;
        }
        if (ref == '{' && tbd == '}')
        {
            return true;
        }
        return false;
    }
}
