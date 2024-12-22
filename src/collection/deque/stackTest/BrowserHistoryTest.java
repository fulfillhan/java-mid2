package collection.deque.stackTest;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visitPage("youtube");
        browser.visitPage("google");
        browser.visitPage("facebook");

        String currentPage1 = browser.goBack();//뒤로가기
        System.out.println("currentPage1 = " + currentPage1);

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
    }
}
