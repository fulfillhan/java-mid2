package collection.link;


public class MyLinkedListV2 {
    private Node first;  //
    private int size = 0;

    //노드 새롭게 추가
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;  //first부터
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index ,Object e){
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        }else{
            Node preNode = getNode(index - 1);
             newNode.next = preNode.next;
             preNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        x.item = element;
        Object item = x.item;
        return item;
    }

    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if(index == 0){
             first = removeNode.next;
        }else{
            Node preNode = getNode(index - 1);
            preNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;

    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {  //index까지 돌리면서
            x = x.next;  //그때까지 실행한다.
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        Node x = first;
        while (first != null) {
            x = x.next;
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
