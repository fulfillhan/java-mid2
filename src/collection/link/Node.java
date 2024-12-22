package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        //루프로 돌리경우 문자열 리터럴은 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while(x != null){
            sb.append(x.item);
            sb.append("->");
            x = x.next;
        }
        sb.append("]");

        return sb.toString();
    }



}
