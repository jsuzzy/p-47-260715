public class RqTest {

    public static void main(String[] args) {
        Rq rq1 = new Rq("삭제?id=1");
        rq1.getActionName(); //삭제


        Rq rq2 = new Rq("수정?id=1");

        rq2.getActionName(); //수정
    }
}
