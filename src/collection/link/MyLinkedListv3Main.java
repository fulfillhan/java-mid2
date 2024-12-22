package collection.link;

public class MyLinkedListv3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> listString = new MyLinkedListV3<>();

        listString.add("a");
        listString.add("b");
        listString.add("c");
        System.out.println(listString);
        System.out.println(listString.get(0));


        MyLinkedListV3<Integer> listInt = new MyLinkedListV3<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt);
        System.out.println(listInt.get(0));

        
    }
}
