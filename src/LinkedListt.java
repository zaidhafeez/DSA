
public class LinkedListt {

    private Node start;
    
    class Node{
        private int info;
        private Node next;
    }

    LinkedListt(){
        this.start = null;
    }

    //--------- INSERT AT BEGIN ---------//
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
        else{

            Node p = start;
            while(p.next != null){
                p = p.next;
            }
        
            p.next = n;

        }
        
    }

    // ---------INSERT AFTER GIVEN VALUE------//

    void insertAfterValue(int item, int searchingItem){

        Node p = searchItem(searchingItem);
        if(p != null){
            Node n = new Node();
            n.info = item;
            n.next = p.next;
            p.next = n;
        }
        else{
            System.out.println("Item is not found");
        }



    }

    // --------- DELETE AT BEGIN --------//
    void delAtBegin(){

        if(start == null){
            System.out.println("Linked List is Empty");
        }
        else{

            Node p = start;
            start = start.next;
            p = null;

        }
        // System.out.println("hello");
        
    }

    // --------- DELETE AT END --------//

    void delAtEnd(){

        if(start == null){
            System.out.println("Linked List is Empty");
        }
        if(start.next == null){
            delAtBegin();
            return;
        }
        Node p = start.next;
        Node pp = start;
        while(p.next != null){
            pp = p;
            p = p.next;
        }

        pp.next = null;
        p = null;


    }

    // DELETION OF NODE CONTAINING VALUE //

    void delAtGivenValue(int searchingItem){
        Node p = searchItem(searchingItem);
        if(start.info == searchingItem){
            delAtBegin();
            return;
        }
        if(p == null){
            System.out.println("The value is not present");
            return;
        }
        else{

            Node pp = start;
            while(pp.next != p){
                pp = pp.next;
            }
            pp.next = p.next;
            p = null;

        }
    }



    // ----------SEARCHING ITEM --------//
    Node searchItem(int searchingItem){
        
        Node p = start;
        while(p != null){
            if(p.info == searchingItem){
                return p;               // return the address of value which is found in linked list
            }
            else{
                p = p.next;
            }
        }
        
        return null;      // search unsuccessfull

        
    }

    // --------- TRAVERSE LINKED LIST-------------//
    void traverse(){

        if(start == null){
            System.out.println("LINKED LIST IS EMPTY");
        }
        Node p = start;
        while(p != null){

            System.out.println("The elements are: " + p.info);
            p = p.next;
        }
    }
    
}
