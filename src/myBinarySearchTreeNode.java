class myBinarySearchTreeNode{

  // Attributes of a tree node
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right  = null;
  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.

    // Creating the root node of the tree
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);

    // Setting myValue to the first element of the array
    myValue = A[0];

    // Loop to add the rest of the elements into the tree
    for(int i = 1; i < A.length; i++) {
      this.insert(A[i]);
    }
  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.

    // If inValue is greater than myValue
    if(inValue > myValue) {
      // If there is no node at right
      if(right == null) {
        // Create a new node at right
        right = new myBinarySearchTreeNode(inValue);
      }else {
        // Insert value at right
        right.insert(inValue);
      }
    }else {
      // If inValue is less than myValue
      if(inValue < myValue) {
        // If there is no node at left
        if(left == null) {
          // Create a new node at left
          left = new myBinarySearchTreeNode(inValue);
        }else {
          // Insert value at left
          left.insert(inValue);
        }
      }
      // If there is a duplicate node, don't insert it
      if(inValue == myValue) {
        System.out.print("ERROR: DUPLICATE NODE IS NOT ALLOWED\n");
      }
    }
    
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time

    // Creating a variables left and right height to keep track of the height of the tree
      int treeHeight;
      int leftHeight = 0;
      int rightHeight = 0;

    // If there is a left node
    if(left != null) {
      // Make recursive call
      leftHeight = left.height();
    }

    // If there is a right node
    if(right != null) {
      // Make recursive call
      rightHeight = right.height();
    }

    // Comparing the height of left and right subtree and assigning the greater one to the final height
    if(leftHeight > rightHeight) {
      treeHeight = leftHeight;
    }else {
      treeHeight = rightHeight;
    }
     return treeHeight + 1;
  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    // If search is less than myValue
    if(search < myValue) {
      // If there is a left node
      if(left != null) {
        // Make recursive call
        return left.depth(search) + 1;
      }else{
        return -1;
      }
    }

    // If search is greater than myValue
    if(search > myValue) {
      // If there is a right node
      if(right != null) {
        // Make recursive call
        return right.depth(search) + 1;
      } else {
        return -1;
      }
    }

    // If search and myValue are the same return 0
    if(search == myValue) {
      return 0;
    }
    // Can't go left, right, or search does not exist return -1
    return -1;
  }

  // This method recursively calculates the number of nodes in the (sub)tree.
  public int size() {

    // Creating a sum variable
    int sum = 1;

    // If there is a left node
    if(left != null) {
      // Increment sum and make recursive call
      sum += left.size();
    }

    // If there is a right node
    if(right != null) {
      // Increment sum and make recursive call
      sum += right.size();
    }

    // Base case
    return sum;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
} 
