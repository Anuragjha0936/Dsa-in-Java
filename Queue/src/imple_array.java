import java.util.Arrays;

public class imple_array {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(3);
        q.add(2);
        q.add(1);
        System.out.println(Arrays.toString(q.queue));
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(Arrays.toString(q.queue));
        System.out.println(q.start);
        System.out.println(q.end);
        q.add(10);
        q.add(9);
        q.add(12);
        q.add(13);
        System.out.println(Arrays.toString(q.queue));
        q.removeAll();
        System.out.println(Arrays.toString(q.queue));
        System.out.println(q.peek());
//        q.add(9);
        System.out.println(q.isEmpty());
    }
}
class Queue{
    int start=-1;
    int end=-1;
    int size=0;
    int[] queue=new int[10];

    public void add(int n){
        if(end==queue.length-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(start==-1){
            start=0;
        }
        end++;
        queue[end]=n;
    }

    public void remove(){
//        for empty queue
        if(start==-1){
            System.out.println("Queue is Empty");
            return;
        }
//        for one element
        if(start==end){
            queue[start]=0;
            start=-1;
            end=-1;
        }else{
            queue[start]=0;
            start++;

        }
    }
    public void removeAll(){
        for(int i=start;i<=end;i++){
            queue[i]=0;
        }
        start=-1;
        end=-1;
    }
    public int peek(){
     return start;
    }
    public boolean isEmpty(){
        if(start==-1 && end==-1){
            return true;
        }else{
            return false;
        }
    }
}
