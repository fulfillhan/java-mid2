package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> cartMap = new HashMap<>();

/*Product는 중복값은 허용하지 않는다. 따라서 해시기반 자료에서 데이터를 저장할 때 equlas hashcode 같이 재정의 해야한다.*/
    public void add(Product product, int addCount) {
        Integer existingCount = cartMap.getOrDefault(product, 0);
        cartMap.put(product,existingCount+addCount);
    }
    /*  default V getOrDefault(Object key, V defaultValue) {
        V v;
        return (((v = get(key)) != null) || containsKey(key))  :
            ? v
            : defaultValue;
    }
    */

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Map.Entry<Product,Integer> entry : cartMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void minus(Product product, int minusCount) {
       //0보다 작으면 제거하고, 그게 아니면 값을 빼야 한다.
        int existingCount = cartMap.getOrDefault(product, 0);
        int newCount = existingCount - minusCount;
        if(newCount <= 0){
            cartMap.remove(product);
        }else {
            cartMap.put(product,newCount);
        }
    }
}
