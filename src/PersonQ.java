public class PersonQ {

    private int front;
    private int rear;
    private Person[] personQ;
    private int total;
    private int size;

    PersonQ(int size){
        this.front = 0;
        this.rear = 0;
        this.total = 0;
        this.size = size;
        this.personQ = new Person[this.size];
    }

    boolean enqueue(Person person){
        if(!isFull()){

            total++;
            personQ[rear] = person;
            rear = (rear + 1) % size;
            return true;

        }
        else{
            return false;
        }
        
    }

    Person dequeue(){

        Person person;

        if(!isEmpty()){

            person = personQ[front];
            total--;
            front = (front + 1) % size;
            return person;

        }

        return null;
    }

    boolean isFull(){
        if(total == size){
            System.out.println("Stack  is Full");
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

    void traverse(){
        int f = front;
        for (int i = front; i <= total; i++) {

            System.out.println("The elements are : "+ personQ[f].toString());
            f = (front + 1) % size;
            
        }
    }
    
}