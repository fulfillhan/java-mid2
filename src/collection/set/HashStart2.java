package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] arrays = new Integer[10];
        arrays[0] = 1;
        arrays[2] = 2;
        arrays[5] = 5;
        arrays[8] = 8;
        //System.out.println("arrays = " + Arrays.toString(arrays));
        System.out.println("arrays = " + Arrays.toString(arrays));

        //8을 찾으려고 한다면
        int searchValue = 8;
        Integer result = arrays[searchValue]; //입력값을 인덱스로
        System.out.println("result = "+result);

    }
}
