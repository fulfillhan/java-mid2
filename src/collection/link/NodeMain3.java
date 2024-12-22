package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        //전체 노드 탐색하기
        printAll(first);

        //마지막 노드 조회
        Node lastNode = getLastNode(first);

        //특정  인덱스 노드 조회하기
        int index = 2;
        Node getNodeIndex2 = getNodeIndex(first,index);

        //추가하기
        add(first,"d");
    }

    private static void add(Node node, String param) {
        //마지막 노드에 추가
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    private static Node getNodeIndex(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
              x = x.next;
        }
        return x;

    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null){
            System.out.println(x.item);
             x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null){
            System.out.println(x.item);
            x= x.next;
        }
    }
}
