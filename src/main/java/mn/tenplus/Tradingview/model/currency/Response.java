package mn.tenplus.Tradingview.model.currency;

public class Response {
    private Data Data;

    public Response(Data data) {
        Data = data;
    }

    public Data getData() {
        return Data;
    }

    public void setData(Data data) {
        Data = data;
    }
}
