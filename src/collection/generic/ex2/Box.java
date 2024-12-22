package collection.generic.ex2;

public class Box<T>{
//동물을 보관하는 박스
    private T value;

    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
