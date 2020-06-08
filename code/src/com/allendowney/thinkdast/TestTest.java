package com.allendowney.thinkdast;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author WangPingChun
 */
public class TestTest {
    @Test
    public void testStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    @Test
    public void testDeque() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}