package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size =0;

    public MyArrayListV1(){  //기본 크기
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity){   //입력값으로 크기 설정
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){  //데이터를 넣을 때마다 사이즈는 증가
        elementData[size] = o;
        size++;
    }

    public Object get(int index){
         return elementData[index];
    }

    public Object set(int index, Object element){ //값을 교체하고 이전값 반환
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o){
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
