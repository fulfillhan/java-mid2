package collection.link;

public class NodeMain {
    public static void main(String[] args) {
        Node node = new Node("A");
        System.out.println(node.hashCode());
        node.next = new Node("B");
        node.next.next = new Node("C");

        //Node x = node;//같은 해시코드 참조
        //System.out.println(x.hashCode());
        while (node != null){
            System.out.println(node.item); //node를 순회하면서 item확인하고
            node = node.next; //순회하면서 다음을 참조
        }
    }
}
