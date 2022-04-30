package binaryTree;

public class FindNodes {
  
    public static void main(String args[]){

        Node head = new Node(16);
            head.left = new Node(10);
                head.left.left = new Node(8);
                head.left.right = new Node(12);
                    head.left.right.left = new Node(11);
                    head.left.right.right = new Node(13);
            head.right = new Node(18);
                head.right.left = new Node(17);
                head.right.right = new Node(20);
                    head.right.right.right = new Node(23);

        inOrder(head);
        System.out.println(" ");
        kNodes(head, 3);
        
        
        

    }

    //inorder
    public static void  inOrder(Node node){

        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    //find nodes at k distance
    int k=0;
    public static void kNodes(Node node,int k){

        if(node == null) return;

        if(k==0){
            System.out.print(node.data+ " ");
        }
        kNodes(node.left, k-1);
        kNodes(node.right,k-1);
    }
}
