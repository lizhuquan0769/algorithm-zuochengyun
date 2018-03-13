package lession1._02由两个栈组成的队列;

import java.util.Stack;

/**
 * Created by lizhuquan on 2018/3/13.
 */
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(Integer newNum) {
        stackPush.push(newNum);
    }

    public Integer poll() {
        ensureExistElement();
        transferIfNeed();
        return stackPop.pop();
    }

    public Integer peek() {
        ensureExistElement();
        transferIfNeed();
        return stackPop.peek();
    }

    private void ensureExistElement() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
    }

    private void transferIfNeed() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }


    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(queue.poll());
        }
    }
}
