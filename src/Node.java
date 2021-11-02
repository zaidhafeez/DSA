public class Node {

    int data;
    Node left, right;

    public Node(int data){

        this.data = data;

    }

    void insert(int value){
        if(value <= data){
            if(left == null){
                left  = new Node(value);
                System.out.println("successfully inserted left node");
            }
            else{

                System.out.println("left");
                left.insert(value);
                
            }
        }
        else{
            if(right == null){
                right = new Node(value);
                System.out.println("successfully inserted in right node");
            }
            else{

                System.out.println("right");
                right.insert(value);
            }
        }
    }

    boolean contains(int value){
            if (value == data){
                System.out.println("found");
                return true;
            }
            else if(value < data){
                if(left == null){
                    System.out.println("Non Found");
                    return false;
                }
                else{
                    return left.contains(value);
                }
            }
            else{
                if(right == null){
                    System.out.println("Not found");
                    return false;
                }
                else{
                    return right.contains(value);
                }
            }
    }
    
}
