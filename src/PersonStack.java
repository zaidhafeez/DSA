public class PersonStack {

    private int top;
    private int size;
    private Person[] personStack;

    PersonStack(int size){
        top = -1;
        this.size = size;
        this.personStack = new Person[size];
    }

    boolean push(Person person){
        if(!isFull()){

            top++;
            personStack[top] = person;
            return true;

        }
        else {
            return false;
        }

    }

    Person pop(){
        if(!isEmpty()){
            Person person;
            person = personStack[top];
            top--;
            return person;
        }
        else{
            return null;
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
