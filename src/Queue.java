public class Queue {

    // private int total;
    private int size;
    private int front;
    private int rear;

    private int[] q;

    Queue(int size){
        // this.total = 0;
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.q = new int[size];
    }
    
    boolean enqueue(int item){

        if(!isFull()){

            if(rear == -1){
                front  = rear = 0;
            }
            else{

                rear++;

            }

            q[rear] = item;
            return true;

        }
        else{
            return false;
        }

    }

    int dequeue(){

        int item;
        if(!isEmpty()){

            item = q[front];

            if(front == rear){
                front = rear = -1;
            }
            else{
                front++;
            }

            return item;
            
        }
        else{
            return Integer.MIN_VALUE;
        }
    }

    void shiftingQ(){
        int j = 0;
        if(front > 0 && rear == size - 1){

            
            for(int i = front; i <= rear; i++){
                q[j] = q[i];
                j++;
            }

            front = 0;
            rear = j - 1;

        }

        


    }

    boolean isFull(){

        if(rear == size - 1){
            return true;
        }
        else{
            return false;
        }

    }

    boolean isEmpty(){

        if(front == -1){
            return true;

        }
        else{
            return false;
        }

    }

    void show(){

        for (int item : q) {

            System.out.println("The element are" + item);
            
        }

    }
}
