package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size =0;

    public MyArrayListV2(){  //기본 크기
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV2(int initialCapacity){   //입력값으로 크기 설정
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object o){  //데이터를 넣을 때마다 사이즈는 증가

        if(size == elementData.length){//배열의 크기에 데이터가 다 들어간 상태라면
            grow();
        }

        elementData[size] = o;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사한다.
     /*   Object[] newArr = new Object[newCapacity];//새로운 크기로 크기 지정
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];  //하나씩 복사
        }*/
        Object[] newArr  = Arrays.copyOf(elementData, newCapacity);  //Arrays.copyOf(기존배열,새로운 배열의길이)
        //newArr = elementData;
        elementData = newArr;//newArr 가 elementData의 참조를 가리킨다.
        //이후 elementData 기존배열은 GC의 대상이 된다.
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
