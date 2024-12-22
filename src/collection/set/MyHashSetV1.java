package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    //LinkedList 자료구조를 담은 배열 선언
   LinkedList<Integer>[] buckets;

    private int size = 0;//배열 내 자료구조의 크기
    private int CAPACITY = DEFAULT_INITIAL_CAPACITY;  //전체 배열의 용량,크기 초기 배열 크기

    //기본생성자
    public MyHashSetV1() {
        //배열 생성
        initBucket();
    }

    //CAPACITY 를 입력받는 생성자
    public MyHashSetV1(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[CAPACITY];
        //배열에 자료구조 다 담기
        for (int i = 0; i <CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(bucket.contains(value)){// bucket에 내가 입력한 값 가지고 잇니
            return false;  //중복 허용하지 않음
        }
        bucket.add(value);
        size++;
        return true;
    }

    //검색 기능넣기
    public boolean contains(int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);//반복문이나 LinkedList 객체는 contains 메서드 제공
    }

    //제거하기
    public boolean remove(int removeValue){
        int hashIndex = hashIndex(removeValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean remove = bucket.remove(Integer.valueOf(removeValue));//Integer 객체로 변환해야함
        //루프를 돌리지만 데이터가 분산되어 있어서 O(1)이다
        if(remove){
            size--;
        }
        return false;
    }

    public int getSize(){
        return size;
    }
    //클래스 내에서만 작성하기 때문에
    private int hashIndex(int value) {
        return value % CAPACITY;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", CAPACITY=" + CAPACITY +
                '}';
    }
}
