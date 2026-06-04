import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.TreeMap;

public class minStack {
    public static void main(String[] args) {
//        MyStack stack=new MyStack();
//        stack.push(2);
//        stack.push(-2);
//        stack.push(1);
//        System.out.println(stack.getMin());
//        System.out.println(stack.top());
        Mystack stack=new Mystack();
        stack.push(10);
        stack.push(2);
        stack.push(1);
        stack.push(-1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

    }
}
//Brute force approach
//class MyStack {
//    TreeMap<Integer,Integer> map=new TreeMap<>();
//    Stack<Integer> stack=new Stack<>();
//
//    public void push(int val) {
//        if(map.containsKey(val)){
//            map.put(val,map.get(val)+1);
//        }else{
//            map.put(val,1);
//        }
//        stack.push(val);
//    }
//
//    public void pop() {
//        int top=stack.peek();
//        if(map.get(top)>1){
//            map.put(top,map.get(top)-1);
//        }else{
//            map.remove(top);
//        }
//
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return map.firstKey();
//    }
//}
// optimised approach
class Mystack{
    record Pair(int key,int value){}

    Deque<Pair> stack=new ArrayDeque<>();
    int min=Integer.MAX_VALUE;

    public void push(int x){
        if(x<min){
            min=x;
        }
        stack.push(new Pair(x,min));
    }
    public int pop(){
       Pair current=stack.pop();
       Pair top=stack.peek();
       min= top.value;
       return current.key;
    }

    public int top(){
        Pair top=stack.peek();
        if(top!=null){
            return top.key;
        }
        return -1;
    }

    public int getMin(){
        Pair top=stack.peek();
        return top.value;
    }
}