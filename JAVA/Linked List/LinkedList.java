class Node{
  Node next;
  int data;
}

class Linked{

  public Node getNewNode(int val){

    Node newNode = new Node();
    newNode.data = val;
    newNode.next = null;
    return newNode;
  }

  public Node insert(Node node,int val){

    if(node == null){
      return getNewNode(val);
    }

    node.next = insert(node.next,val);
    return node;
  }

  public Node insertAtStart(Node node,int val){

    if(node == null){
      return getNewNode(val);
    }

    Node snode = getNewNode(val);
    snode.data = val;
    snode.next = node;
    return snode;
  }

  public void printList(Node node){

    if(node == null)
      return;

    System.out.print(node.data+" ");
    printList(node.next);
  }


}

public class LinkedList{

  public static void main(String[] args){

    Node root = null;
    Linked link = new Linked();
    root = link.insertAtStart(root,1);
    /*root = link.insert(root,1);
    /*root = link.insert(root,2);
    root = link.insert(root,3);
    root = link.insert(root,4);*/
    link.printList(root);

  }
}