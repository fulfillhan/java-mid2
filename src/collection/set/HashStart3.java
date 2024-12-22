package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] arrays = new Integer[100];
        arrays[1] = 1;
        arrays[2] = 2;
        arrays[5] = 5;
        arrays[8] = 8;
        arrays[14] = 14;
        arrays[99] = 99;
        //System.out.println("arrays = " + Arrays.toString(arrays));
        System.out.println("arrays = " + Arrays.toString(arrays));


        int searchValue = 99;
        Integer result = arrays[searchValue]; //입력값을 인덱스로
        System.out.println("result = "+result);// 속도는 빠르다 매모리 낭비가 크다

    }
}
