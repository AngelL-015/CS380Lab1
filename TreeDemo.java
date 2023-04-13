class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /*
   recursive insert method
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }
   
   
   
   /**
    * A method to display BST in Pre-order Traversal.
	* Visits nodes from root, left, and right recursively.
    * @param root is root node of sub(tree)
    */
   public void preOrderTraversal(Node root){
      
	  // Base Case - Leaf node Encountered, returns nothing.
	   if (root == null) {
		   return;
	   }
	   
	   // Order of traversal - Root, Left, Right
	   System.out.print(root.value + " ");
	   inOrderTraversal(root.left);
	   inOrderTraversal(root.right);
	   
   }

   
   
   /**
    * A method to display BST in In-order Traversal.
	* Visit nodes from left, root, and right recursively.
	* @param root is root node of sub(tree)
    */
   public void inOrderTraversal(Node root){
      
	  // Base Case - Leaf node Encountered, returns nothing.
	   if (root == null) {
		   return;
       }
	   
	   // Order of traversal - Left, Root, Right
       inOrderTraversal(root.left);
       System.out.print(root.value + " ");
       inOrderTraversal(root.right);
       
   }
   
   
   
   /**
    * A method to display BST in Post-order Traversal.
	* Visit nodes from left, right, and root recursively.
    * @param root is root node of sub(tree)
    */
   public void postOrderTraversal(Node root){
	   
	   // Base Case - Leaf node Encountered, returns nothing.
	   if (root == null) {
		   return;
	   }
	      
	   // Order of traversal - Left, Right, Root
	   inOrderTraversal(root.left);
	   inOrderTraversal(root.right);
	   System.out.print(root.value + " ");
	   
   }
   
   
   
   /*
   a method to find the node in the tree
   with a specific value
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }
   
   
   
   /*
   a method to find the node in the tree
   with a smallest key
   */
   public int getMin(Node root){
      //implement me
   }
  
  
  
   /*
   a method to find the node in the tree
   with a largest key
   */
   public int getMax(Node root){
	  //implement me
   }
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}