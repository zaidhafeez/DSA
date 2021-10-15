public class LinkedListPractice {

    private Node start;

    class Node{
        private int info;
        private Node next;
    }

    LinkedListPractice(){
        this.start = null;
    }

    void insertAtBegin(int item){
        
        Node n = new Node();
        n.info = item;
        n.next = start;
        start = n;

    }

    void insertAtEnd(int item){
        Node n = new Node();
        n.info = item;
        n.next = null;
        if(start == null){
            start = n;
        }
        Node p = start;
        while(p.next != null){
            p = p.next;
        }
        p.next = n;
    }

    void insertAfterValue(int item, int searchItem){
        Node p = searching(searchItem);
        if(p != null){
            Node n = new Node();
            n.info = item;
            n.next = p.next; 
            p.next = n;
        }
    }


    void delAtBegin(){

        if(start == null){
            System.out.println("Linked List is empty");
        }
        else{
            Node p = start;
            start = start.next;
            p = null;
        }

    }

    void delAtEnd(){

        if(start.next == null){
            delAtBegin();
        }
        else{
            Node p = start.next;
            Node pp = start;
            while(p.next != null){
                pp = p;
                p = p.next;
            }

            pp.next = null;
            p = null;
        }

    }

    void delAtGivenValue(int item){

        if(start.info == item){
            delAtBegin();
            return;
        }
        
        // Node p = start.next;
        // Node pp = start;
        // while(p != null){
        //     if(p.info == item){
        //         break;
        //     }
        //     else{
        //         pp = p;
        //         p = p.next;
        //     }
        // }
        // pp.next = p.next;
        // p = null;
        Node p = searching(item);
        Node pp = start;
        if(p != null){

            while(pp.next != p){
                 
                pp = pp.next;
                

            }
            pp.next = p.next;
            p = null;
        }
    }


    Node searching(int searchItem){
        
        Node p = start;
       
        while(p != null){
            if(p.info == searchItem){  
                return p;
            }
            else{
                p = p.next;
            }
        }
        return null;

    }

    void traverse(){

        if(start == null){
            System.out.println("Linked List is empty");
        }
        else{
            Node p = start;
            while(p != null){
                System.out.println("the element in the list are: " + p.info);
                p = p.next;
            }
        }

    }

    
}
