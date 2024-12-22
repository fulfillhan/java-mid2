package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] arrays = new Integer[4];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 5;
        arrays[3] = 8;
        //System.out.println("arrays = " + Arrays.toString(arrays));
        System.out.println("arrays = " + Arrays.toString(arrays));

        //8을 찾으려고 한다면
        int searchValue = 8;
        //4번 반복됨
        for (int inputValue : arrays){
            System.out.println(inputValue);
        }

    }
}
