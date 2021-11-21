package mn.tenplus.Tradingview.model.currency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExchangeMarket {

    private Map<String , ArrayList<String>> pairs = new HashMap<>();

    public ExchangeMarket(Map<String,ArrayList<String>> pair) {
        this.pairs = pair;
    }

    public Map<String, ArrayList<String>> getPairs() {
        return pairs;
    }

    public void setPairs(Map<String, ArrayList<String>> pairs) {
        this.pairs = pairs;
    }
}
