package collection.deque.stackTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> stackPage = new ArrayDeque<>();

    //현재 페이지에 대한 정보
    private String currentPage = null;

    public void visitPage(String page) {
        if(currentPage != null){
            stackPage.push(page);
        }
        currentPage = page;
        System.out.println("방문 = "+currentPage);

    }

    public String goBack() {
        if(!stackPage.isEmpty()){
            String currentPage = stackPage.peek();
            System.out.println("뒤로 가기 = "+currentPage);
            return currentPage;
        }
        return null;
    }
}
