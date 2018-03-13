package lession1._01设计一个有getMin功能的栈;

import java.util.Random;
import java.util.Stack;

/**
 * Created by lizhuquan on 2018/3/13.
 */
public class MyStack2 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(Integer newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else {
            Integer currMin = getMin();
            if (newNum > currMin) {
                stackMin.push(currMin);
            } else {
                stackMin.push(newNum);
            }
        }
        stackData.push(newNum);
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("stackData is empty");
        }
        stackMin.pop();
        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stackMin is empty");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack2 stack2 = new MyStack2();
        for (int i = 0; i < 5; i++) {
            Integer curr = new Random().nextInt(10);
            stack2.push(curr);
            System.out.println("入栈:" + curr);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "个数");
            System.out.println("当前最小值:" + stack2.getMin());
            System.out.println("当前弹出值:" + stack2.pop());
        }
    }
}
