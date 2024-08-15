class bst{
    private class Node{
        int value;
        Node right;
        Node left;

        public Node(int val) {this.value = val;}
    }
    private Node root;

    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
       if(node == null){
        node = new Node(value);
        return node;
       }
       if(value < node.value){
        node.left = insert(value, node.left);
       }
       if(value > node.value){
        node.right = insert(value, node.right);
       }
      
      return node;
    }
    
    public void populate(int [] nums){
        for(int i =0;i<nums.length;i++) this.insert(nums[i]);
    }
    public void display(){
        display(this.root,"Root node: ");
    }

    private void display(Node node,String details){
        if(node == null)
        return ;
    
        System.out.println(details + node.value);
        display(node.left,"left child of :" + node.value);
        display(node.right,"right child of :" + node.value);
    }
}

public class binaryst {
    public static void main(String[] args) {
        int [] nums = { 3,8,9,4,1,5};
        bst b = new bst();
        b.populate(nums);
        b.display();
        
        
    }
}
