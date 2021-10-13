public class CircularQ {

    private int front;
    private int rear;
    private int size;
    private int[] cirQ;

    CircularQ(int size){
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.cirQ = new int[size];
    }

    void enqueue(int item){
        if((front == 0 && rear == size - 1) || front == (rear + 1)){

            System.out.println("INSERTION IS NOT POSSOBLE");

        }
        else{

            if(rear == -1){
                front  = rear = 0;
            }
            else if(rear == size-1){
                rear = 0;
            }
            else{
                rear++;
            }

            cirQ[rear] = item;
            
        }

    }

    int dequeue(){
        int item;
        if(front == -1){
            System.out.println("DELETION IS NOT POSSIBLE");
        }
        item = cirQ[front];
        if(front == rear){
            front = rear = 0;
        }
        else if(front == size - 1){
            front = 0;
        }
        else{
            front++;
        }

        return item;

    }

    void show(){

        for (int item : cirQ) {

            System.out.println("The element are" + item);
            
        }

    }
    
}
