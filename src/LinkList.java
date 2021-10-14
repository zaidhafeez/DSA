public class LinkList {

    private Node start;

    class Node{

        private int info;
        private Node next;

    }

    // INSERTION AT BEGINNING IN THE LINKED LIST //

    void insertAtBegin(int item){

        Node n = new Node();
        n.info = item;
        n.next = start;
        start = n;

    }

    // INSERTION AT THE END IN LINKED LIST //

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

    // INSERTION AFTER GIVEN VALUE //

    void insertAfterValue(int item, int searchingItem){
        Node p = search(searchingItem);
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

    // DELETION AT BEGINNING IN THE LINKED LIST //

    void delAtBegin(){
        
        if(start == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node p = start;
        start = start.next;
        p = null;
    }

    // DELETION AT END IN THE LINKED LIST //

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

    // DELETION OF NODE CONTAINING VALUE //

    void delAtGivenValue(int item){
        if(start == null){
            System.out.println("Linked List is Empty");
        }
        else{
            if(start.info == item){
                delAtBegin();
                return;
            }
            else{
                Node p = start.next;
                Node pp = start;

                while(p != null){
                    if(p.info == item){
                        break;
                    }
                    else{
                        pp = p;
                        p = p.next;
                    }
                    
                }
                pp.next = p.next;
                p = null;
            }
        }
    }

    // SEARCHING THE GIVEN ITEM IN THE LINKED LIST //

    Node search(int searchingItem){
        
        Node p = start;
        while(p != null){
            if(p.info == searchingItem){
                return p;
            }
            p = p.next;
        }
        return null;

    }

    // TRAVERSING THE LINKED LIST //

    void traverse(){

        Node p = start;
        if(start == null){
            System.out.println("Linked List is Empty");
            return;
        }
        while(p != null){
            System.out.println("The elements are : " + p.info);
            p = p.next;
        }
    }
    
}
