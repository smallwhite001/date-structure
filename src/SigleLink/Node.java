package SigleLink;


/**
 * 单链表
 */
public class Node {
    //节点数据
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //添加节点
    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        //将传入节点赋值在当前节点的下一个为空节点
        currentNode.next = node;
        return node;
    }

    //获取下一个节点
    public Node next() {
        return this.next;
    }

    //当前节点是否为最后一个节点
    public boolean isLastNode() {
        return this.next == null;
    }

    //删除一个节点
    public void deleteNode() {
        Node currentNode = this.next.next;
        this.next = currentNode;
    }

    //插入一个节点，只能插入下一个
    public void insertAfter(Node node){
        //获取当前节点的下一个节点
        Node nextNode = this.next();
        this.next = node;
        node.next = nextNode;
    }

    //查看所有节点信息
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
            if (currentNode == null) {
                break;
            }
        }
        System.out.println();
    }

}
