import java.util.ArrayDeque;
import java.util.Deque;

public class impl_queue_using_stack {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
class MyStack {
    Deque<Integer> dq=new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        dq.addLast(x);
    }

    public int pop() {
        int top=dq.peekLast();
        dq.removeLast();
        return top;
    }

    public int top() {
        return dq.peekLast();
    }

    public boolean empty() {
        return dq.isEmpty();
    }
}

