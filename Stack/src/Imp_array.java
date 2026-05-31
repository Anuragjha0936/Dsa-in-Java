import java.util.Arrays;

public class Imp_array {
    public static void main(String[] args) {
        stack_array st=new stack_array();
        st.push(5);
        st.push(2);
        st.push(1);
        for(int i=0;i<8;i++){
            st.push(i);
        }
        for(int i=0;i<11;i++){
            st.pop();
        }

        System.out.println(Arrays.toString(st.stack));
        int top=st.top();
        System.out.println(top);

        st.push(10);
        st.push(11);
        System.out.println(st.size());
    }
}
class stack_array{
    int top=-1;
    int[] stack=new int[10];

    public void push(int n){
        if(top==stack.length-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=n;
    }
    public int top(){
        if(top==-1){
            return -1;
        }
        return stack[top];
    }

    public int size(){
        return top+1;
    }
    public void pop(){
        if(top==-1){
            System.out.println("No element present");
            return;
        }
        stack[top]=0;
        top--;
    }
}
