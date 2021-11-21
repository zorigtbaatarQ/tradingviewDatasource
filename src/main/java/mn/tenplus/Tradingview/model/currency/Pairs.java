package mn.tenplus.Tradingview.model.currency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Pairs {
    Map<String , ArrayList<String>> dic = new HashMap<>();

    public Pairs(Map<String, ArrayList<String>> dic) {
        this.dic = dic;
    }

    public Pairs() {

    }

    public Map<String, ArrayList<String>> getDic() {
        return dic;
    }

    public void setDic(Map<String, ArrayList<String>> dic) {
        this.dic = dic;
    }

    public void setDic(String name, ArrayList<String> value){
        dic.put(name,value);
    }
}
