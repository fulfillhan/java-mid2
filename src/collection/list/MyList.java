package collection.list;

public interface MyList<E>{
    //공통된 기능을 뽑아 추상화 한 인터페이스
    int size();
    void add(E e);
    void add(int index,E e);//특정 위치에 요소 추가
    E get(int index);
    E set(int index,E element);
    E remove(int index);
    int indexOf(E e);
}
