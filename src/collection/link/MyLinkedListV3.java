package collection.link;


public class MyLinkedListV3<E> {
    private Node<E> first;  //
    private int size = 0;

    //노드 새롭게 추가
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;  //first부터
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index ,E e){
        Node<E> newNode = new Node<>(e);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        }else{
            Node<E> preNode = getNode(index - 1);
             newNode.next = preNode.next;
             preNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, E element) {
        Node<E> x = getNode(index);
        x.item = element;
        return x.item;
    }

    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if(index == 0){
             first = removeNode.next;
        }else{
            Node<E> preNode = getNode(index - 1);
            preNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;

    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {  //index까지 돌리면서
            x = x.next;  //그때까지 실행한다.
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        Node<E> x = first;
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

    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            //루프로 돌리경우 문자열 리터럴은 StringBuilder 사용
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
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

}
