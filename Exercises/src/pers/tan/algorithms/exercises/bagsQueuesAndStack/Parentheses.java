package pers.tan.algorithms.exercises.bagsQueuesAndStack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

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

public class Parentheses
{
    public static void main(String[] args)
    {
        ParenthesesBalancer pb = new ParenthesesBalancer(40);
        while (!StdIn.isEmpty())
        {
            Character in = StdIn.readChar();
            pb.AddParenthesis(in);
            StdOut.println(in);
        }
        StdOut.println("Is the input sequence balanced: " + pb.isBalanced());
    }
}
