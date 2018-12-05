package SigleLink;

public class test {
    public static  void main(String args[]){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.append(node2).append(node3).append(new Node(4));
      //  System.out.println(node1.next().next().data);
        node1.show();
//        node1.deleteNode();
//        node1.show();
        node1.insertAfter(new Node(5));
        node1.show();
    }
}
