import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String cmd;
    String actionName;
    Map<String, String> paramMap = new HashMap<>();

    public Rq(String cmd) {
        this.cmd = cmd;

        //키, 밸류 저장 전용 자료구조 -> map
        //목록?keywordType=content&keyword=과거
        String[] cmdBits = cmd.split("\\?"); //["목록", "keywordType=content&keyword=과거"]
        actionName = cmdBits[0];
        String params = cmdBits.length > 1 ? cmdBits[1] : "";

        if (params.equals("")) {
            return;
        }

        String[] paramBits = params.split("&"); //["keywordType=content","keyword=과거"]

        for (String param : paramBits) {
            String[] keyValue = param.split("=");
            if(keyValue.length < 2){
                continue;
            }
            paramMap.put(keyValue[0], keyValue[1]);
        }
    }

    public String getActionName() {
        return actionName;
    }

    public String getParam(String key, String defaultValue) {
        String rst = paramMap.getOrDefault(key, defaultValue);

        return rst;
    }

    public int getParamAsInt(String key, int defaultValue){
        String rst = getParam(key, "");

        try{
            return Integer.parseInt(rst);
        }catch (NumberFormatException e){
            System.out.println("잘못된 입력값을 넣어서 기본값으로 반환됩니다.");
            return defaultValue;
        }
    }
}
