public class Stack {

    private int top;
    private int[] stack;
    private int size;

    Stack(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }
    
    boolean push(int item){

        if(!isFull()){
            top++;
            stack[top] = item;
            return true;
        }
        else{
            return false;
        }


    }

    int pop(){
        if(!isEmpty()){
            int item = stack[top];
            top--;
            return item;
        }
        else{
            return Integer.MIN_VALUE;
        }
    }

    boolean isFull(){
        if(top == size -1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }

    }
}
