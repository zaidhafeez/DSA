public class OptimizedCQ {

    private int front;
    private int rear;
    private int total;
    private int size;
    private int[] CQ;

    OptimizedCQ(int size){
        front = 0;
        rear = 0;
        total = 0;
        this.size = size;
        this.CQ = new int[size];
    }

    boolean enqueue(int item){
        if(!isFull()){
            
            CQ[rear] = item;
            rear = (rear + 1) % size;
            total++;
            return true;
        }
        else{
            return false;
        }
    }

    int dequeue(){

        int item = 0;

        if(!isEmpty()){
            
            item = CQ[front];
            front = (front + 1) % size;
            total--;

        }

        return item;
    }

    boolean isFull(){
        if(total == size){
            System.out.println("QUEUE IS FULL");
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty(){
        if(total == 0){
            System.out.println("QUEUE IS EMPTY");
            return true;
        }
        else{
            return false;
        }
    }

    void show(){

        for (int item : CQ) {

            System.out.println("The element are" + item);
            
        }

    }
    
}
