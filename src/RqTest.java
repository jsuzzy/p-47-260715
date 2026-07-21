public class RqTest {

    public static void main(String[] args) {
        testGetParam();
    }

    public static void testActionName(){
        Rq rq1 = new Rq("삭제?id=1");
        String action = rq1.getActionName(); //삭제


        Rq rq2 = new Rq("수정?id=1");

        rq2.getActionName(); //수정
    }

    public static void testGetParam(){
        Rq rq = new Rq("목록?searchKeyword=영광"); //key=value
        String searchKeyword = rq.getParam("searchKeyword", ""); // "영광"
        System.out.println(searchKeyword);

        Rq rq2 = new Rq("목록?keywordType=content"); //key=value
        String keywordType = rq2.getParam("keywordType", ""); // content
        System.out.println(keywordType);

        Rq rq3 = new Rq("목록?keywordType=author"); //key=value
        String keywordType2 = rq3.getParam("keywordType", ""); // author
        System.out.println(keywordType2);
    }


}
