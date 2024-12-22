package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';
        System.out.println("A = "+(int)A);
        System.out.println("B = "+(int)B);
        /*A = 65
          B = 66
          문자는 고유한 번호를 가지고 있다.*/

        //hashCode
        int hashCode1 = hashCode("A");
        int hashCode2 = hashCode("B");
        int hashCode3 = hashCode("AB");
        System.out.println("A hashCode = " + hashCode1);
        System.out.println("B hashCode = " + hashCode2);
        System.out.println("AB hashCode = " + hashCode3);

        System.out.println("------");

        //hashIndex
        int hashIndex1 = hashIndex(hashCode1);
        int hashIndex2 = hashIndex(hashCode2);
        int hashIndex3 = hashIndex(hashCode3);
        System.out.println("hashIndex1 = "+hashIndex1);
        System.out.println("hashIndex2 = "+hashIndex2);
        System.out.println("hashIndex3 = "+hashIndex3);


    }
    static int hashCode(String str){
        char[] charArray = str.toCharArray();//문자열을 캐릭터 타입 배열로 바꾸기
        int sum = 0;
        for (char c :
                charArray) {
            sum = sum+(int)c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
