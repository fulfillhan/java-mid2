package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size =0;

    public MyArrayListV4(){  //기본 크기
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV4(int initialCapacity){   //입력값으로 크기 설정
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(E o){  //데이터를 넣을 때마다 사이즈는 증가

        if(size == elementData.length){//배열의 크기에 데이터가 다 들어간 상태라면
            grow();
        }

        elementData[size] = o;
        size++;
    }

    public void add(int index,E o){
        if(size == elementData.length){//배열의 크기에 데이터가 다 들어간 상태라면
            grow();
        }
        //기존의 데이터 위치는 한칸씩 이동해야 한다.
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

    //데이터 추가, 오른쪽으로 데이터를 밀기, 그럼 범위는 왼쪽(크기)끝에서부터 인덱스까지
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {  //뒤에서부터 줄어드는 범위
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);//newArr 가 elementData의 참조를 가리킨다.

    }

    @SuppressWarnings("unchecked")
    public E get(int index){
         return (E) elementData[index];
    }

    public E set(int index, E element){ //값을 교체하고 이전값 반환
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public E remove(int index){
        E oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] =null;//마지막은 null값을 넣어주기
        return oldValue;
    }

    // 데이터 삭제
    private void shiftLeftFrom(int index) {
        for (int i = index; i <size-1 ; i++) {//특정 인덱스 부터 줄여진 크기까지
            elementData[i] = elementData[i+1];
        }
    }


    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        //Arrays.copyOf(elementData,size) : elementData 객체를 size만큼만 복사한다?
        return Arrays.toString(Arrays.copyOf(elementData,size))+
                ", size = "+size + ", capacity = "+elementData.length;
    }


}
