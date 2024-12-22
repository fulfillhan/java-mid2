package collection.set;


import java.util.Arrays;

public class MyHashSetV0 {
    //set 구현:배열에 데이터를 저장함
    private int[] elementData = new int[10];
    private int size = 0;


    public boolean add(int value){
        if(Contains(value)){
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    private boolean Contains(int value) {
        for (Integer data : elementData){ // static 메서드는 인스턴스 변수에 접근할 수 없다.
            if(data == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return """
                MyHashSetVO="""+ Arrays.toString(Arrays.copyOf(elementData,size))+
                "size= "+size;
    }
}
