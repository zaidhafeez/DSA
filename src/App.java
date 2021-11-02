public class App {
    public static void main(String[] args) throws Exception {

        // ----------STACK---------//
        
        // Stack stack = new Stack(5);

        // stack.push(15);
        // stack.push(25);
        // stack.push(30);
        // stack.push(35);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // System.out.println(stack.pop());

        //-----------STACK PERSON ------ //

            // Person personObj = new Person("Mohammad Zaid", 25);
            // Person personObj1 = new Person("ZeeshanUddin", 26);

        //     PersonStack personStack = new PersonStack(5);
        //     personStack.push(personObj);
        //     personStack.push(personObj1);

        //    System.out.println(personStack.pop().toString());
        //    System.out.println(personStack.pop().toString());


        //-----------QUEUE ------ //

        // Queue q = new Queue(5);
        // q.enqueue(2);
        // q.enqueue(4);
        // q.enqueue(6);
        // q.enqueue(7);
        // q.enqueue(8);

        // // System.out.println(q.dequeue());
        // // System.out.println(q.dequeue());
        // q.dequeue();
        // q.dequeue();

        // q.shiftingQ();
        // // q.show();

        // q.enqueue(9);
        // q.enqueue(10);

        // q.show();

        // ---------- CIRCULAR QUEUE --------- //

        // CircularQ cq = new CircularQ(5);
        // cq.enqueue(1);
        // cq.enqueue(2);
        // cq.enqueue(3);

        // // cq.dequeue();
        
        // cq.enqueue(4);
        // cq.enqueue(5);
        // cq.dequeue();
        // cq.enqueue(6);
        // cq.dequeue();
        // cq.dequeue();
        // cq.enqueue(7);
        // cq.show();
        // cq.dequeue();
        // cq.show();
       

        // ----------OPTIMIZED CIRCULAR QUEUE--------//

        // PersonQ cq = new PersonQ(5);
        // cq.enqueue(personObj);
        // cq.enqueue(personObj1);
        // cq.enqueue(3);

        // cq.dequeue();
        
        // cq.enqueue(4);
        // cq.enqueue(5);
        // cq.dequeue();
        // cq.enqueue(6);
        // cq.dequeue();
        // cq.dequeue();
        // cq.enqueue(7);
        // cq.traverse();

        // ----------SINGLY LINKED LIST ----------- //

        // LinkedListPractice llObj = new LinkedListPractice();
        // // llObj.traverse();
        // llObj.insertAtBegin(5);
        // llObj.insertAtBegin(10);
        // llObj.insertAtEnd(25);
        // llObj.insertAtEnd(35);
        // llObj.insertAfterValue(6, 5);
        // llObj.insertAfterValue(11, 10);
        // llObj.insertAfterValue(26, 25);
        // llObj.traverse();

        // llObj.delAtEnd();
        // llObj.delAtEnd();
        // llObj.delAtGivenValue(26);
        // llObj.delAtGivenValue(10);
        // llObj.delAtGivenValue(26);
        

        // // llObj.delAtBegin();
        // // llObj.delAtBegin();
        // llObj.insertAfterValue(32, 35);
        // llObj.delAtEnd(); 
        // llObj.traverse();

        // Binary Search Tree //
        // BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(10);
        // bst.insert(8);
        Node n = new Node(10);
        n.insert(5);
        n.insert(10);
        n.insert(12);
        n.contains(10);
        n.contains(11);
        
        // BinarySearchTree n = new BinarySearchTree();
        // Node1 n1 = null;
        // n1 = n.insert(n1, 5);
        // n1 = n.insert(n1, 10);
        // n1 = n.insert(n1, 12);
        // n1 = n.insert(n1, 11);
        // n1 = n.insert(n1, 4);
        // n1 = n.insert(n1, 13);

    }
}
