class Node{
  int data;
  Node left;
  Node right;
}

class bstp{

  public Node insert(Node node,int val){

    if(node == null){
      
      return getNewNode(val);
    }

    if(val < node.data){
      node.left = insert(node.left,val);
    }
    else if(val > node.data){
      node.right = insert(node.right,val);
    }

    return node;
  }

  public Node getNewNode(int val){

    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }

  public Node delete(Node node,int val){

    if(node == null){
      return null;
    }

    if(val < node.data){

      node.left = delete(node.left,val);
    }
    else if(val > node.data){

      node.right = delete(node.right,val);
    }
    else{

      if(node.left == null || node.right == null){

        Node temp = null;
        temp = node.left != null ? node.left : node.right;

        if(temp == null){
          return null
        }
        else{
          return temp;
        }
      }
      else{

        Node successor = getSuccessor(node);
        node.data = successor.data;

        node.right = delete(node.right,successor.data);

        return node;
      }
    }
    return node;
  }

  public Node getSuccessor(Node node){

    if(node == null){
      return null;
    }

    Node temp = node.right;
    while(temp.left != null){
      temp = temp.left;
    }

    return temp;
  }

  public void inOrder(Node node){

    if(node == null){
      return;
    }

    inOrder(node.left);
    System.out.print(node.data+" ");
    inOrder(node.right);
  }
}

class bst1{

  public static void main(String[] args){

    Node root = null;
    bstp bstn = new bstp();
    root = bstn.insert(root,8);
    root = bstn.insert(root,3);
    root = bstn.insert(root,6);
    root = bstn.insert(root,10);
    root = bstn.insert(root,4);
    root = bstn.insert(root,7);
    root = bstn.insert(root,1);
    root = bstn.insert(root,14);
    root = bstn.insert(root,13);

    bstn.inOrder(root);

    //System.out.println("value exists : "+bstn.valExists(root,13));
    
  }
}