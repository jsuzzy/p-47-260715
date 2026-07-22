import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WiseSayingService {
    int lastId = 0; // 가장 최근 생성된 명언 번호. 번호 관리
    ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

    public int findIndexById(int id) {
        int targetIdx = -1;

        return IntStream.range(0, wiseSayings.size())
                .filter(i -> wiseSayings.get(i).getId() == id)
                .findFirst()
                .orElse(-1);

    }

    public WiseSaying findById(int id){
        int idx = findIndexById(id);
        if(idx == -1){
            return null;
        }

        return wiseSayings.get(idx);
    }

    public WiseSaying write(String content, String author) {
        ++lastId;
        WiseSaying w1 = new WiseSaying(lastId, content, author);
        wiseSayings.add(w1);
//        ++lastIndex;

        return w1;
    }

    public void modify(WiseSaying wiseSaying, String content, String author){
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);
    }

    public boolean delete(int id){
        boolean rst = wiseSayings.removeIf(wiseSaying -> wiseSaying.getId() == id);
        return rst;
    }

    public List<WiseSaying> findAllIdDesc(){
        return wiseSayings.reversed();
    }

}
