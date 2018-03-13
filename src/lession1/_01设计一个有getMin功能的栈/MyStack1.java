package lession1._01设计一个有getMin功能的栈;

import java.util.Random;
import java.util.Stack;

/**
 * Created by lizhuquan on 2018/3/13.
 */
public class MyStack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(Integer newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= getMin()) {
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("stackData is empty");
        }
        Integer value = stackData.pop();
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stackMin is empty");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();
        for (int i = 0; i < 5; i++) {
            Integer curr = new Random().nextInt(10);
            stack1.push(curr);
            System.out.println("入栈:" + curr);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "个数");
            System.out.println("当前最小值:" + stack1.getMin());
            System.out.println("当前弹出值:" + stack1.pop());
        }
    }
}
