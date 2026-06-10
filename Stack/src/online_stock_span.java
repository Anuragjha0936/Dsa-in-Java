import java.util.Stack;

public class online_stock_span {
    public static void main(String[] args) {
       StockSpanner stock=new StockSpanner();
       stock.next(31);
        System.out.println(stock.next(41));
        stock.next(48);
        stock.next(59);
        stock.next(79);

    }

}

class StockSpanner {
    record Pair(int key,int value){}

    Stack<Pair> stack=new Stack<>();
    int index;
    int span=1;
    public StockSpanner(){
        stack=new Stack<>();
        index=0;
    }
    public int next(int price){
        while(!stack.isEmpty() && stack.peek().key<=price){
            stack.pop();

        }
        if(stack.isEmpty()){
            stack.push(new Pair(price,index));
            span=index+1;
            index++;
            return span;
        }
        else{
            span=index-stack.peek().value;
            stack.push(new Pair(price,index));
            index++;
        }
        return span;
    }
    }


