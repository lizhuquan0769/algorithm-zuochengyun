package lession1._05用一个栈实现另一个栈的排序;

import java.util.Random;
import java.util.Stack;

/**
 * Created by lizhuquan on 2018/3/14.
 */
public class SortStackByStack {

    public static void sortStatckByStatck(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            Integer curr = stack.pop();
            if (help.isEmpty()) {
                help.push(curr);
            } else {
                if (curr <= help.peek()) {
                    help.push(curr);
                }
                else {
                    stack.push(help.pop());
                    while (!help.isEmpty() && curr > help.peek()) {
                        stack.push(help.pop());
                    }
                    help.push(curr);
                }
            }
        }
        while(!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(new Random().nextInt(10) + 1);
        }

        sortStatckByStatck(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
