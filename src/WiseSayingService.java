import java.util.List;

public class WiseSayingService {
    WiseSayingRepository wiseSayingRepository = AppContext.wiseSayingRepository;


    public WiseSaying findById(int id){
        return wiseSayingRepository.findById(id);
    }

    public WiseSaying write(String content, String author) {

        WiseSaying w1 = new WiseSaying(content, author);
        w1 = wiseSayingRepository.save(w1);

        return w1;
    }

    public void modify(WiseSaying wiseSaying, String content, String author){
        wiseSaying.setContent(content);
        wiseSaying.setAuthor(author);

        //저장을 해야 한다.
        wiseSayingRepository.save(wiseSaying);
    }

    public boolean delete(int id){
        boolean rst = wiseSayingRepository.delete(id);
        return rst;
    }

    public List<WiseSaying> findAllIdDesc(){
        return wiseSayingRepository.findAllIdDesc();
    }

}
