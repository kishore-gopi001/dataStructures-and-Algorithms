import java.util.Scanner;

class binaryTree{
    public binaryTree(){

    }
    private static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
        private  Node root;
    public void populate(Scanner scan){
        System.out.println("enter the root node");
        int value = scan.nextInt();
        root = new Node(value);
        populate(scan,root);
    }
    private void populate(Scanner scan,Node node){
        System.out.println(" if you want to insert at left of" +node.val);
        boolean left = scan.nextBoolean();
         if(left){
         System.out.println("enter the root node");
         int value = scan.nextInt();   
         node.left = new Node(value);
         populate(scan,node.left);   
         }
         System.out.println(" if you want to insert at right of " +node.val);
         boolean right = scan.nextBoolean();
         if(right){
            System.out.println("enter the root node");
            int value = scan.nextInt();   
            node.right = new Node(value);
            populate(scan,node.right);   
            }
            System.out.println("node inserted successfully");
    }

            public void display(){
                display(this.root,"");
            }
            public void display(Node node,String ident){
                if(node == null) return;

                System.out.println(ident + node.val);
                display(node.left,ident+ " \t");
                display(node.right,ident+ " \t");
            }

    }
public class Tree {
        public static void main(String[] args) {
            binaryTree tree = new binaryTree();
            Scanner scan = new Scanner(System.in);
            tree.populate(scan);
            tree.display();
        }
    
}