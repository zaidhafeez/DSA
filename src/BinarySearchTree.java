/**
 * BinarySearchTree
 */
class Node1{
    int data;
    Node1 left, right;
}
public class BinarySearchTree {

    Node1 root;

    BinarySearchTree(){
        this.root = null;
    }

    Node1 insert(Node1 root, int data){
        if(root == null){
            
            Node1 newNode = new Node1();
            newNode.data = data;
            newNode.left = newNode.right = null;
            root  = newNode;
            System.out.println("successfully inserted root node");

            return root;
        }
        else if(data <= root.data){
            root.left = insert(root.left, data);
            System.out.println("successfully inserted left node");
        }
        else{
            root.right = insert(root.right, data);
            System.out.println("successfully inserted right node");
        }

        return root;
    }


    
    // -- Insert  -- //

    // void insert(int value){

    //     if(value <= data){

    //         root = newNode;

    //         System.out.println("Successfully inserted root");

    //         return root;

    //     }
    //     else if(data <= root.data){
    //         root.leftNode = insert(data);
    //         System.out.println("Successfully Insert Left");
    //     }
    //     else{
    //         root.rightNode = insert(data);
    //         System.out.println("Successfully Insert Right");
    //     }

    //     return root;

    // }
    
}