package mn.tenplus.Tradingview.service;

import mn.tenplus.Tradingview.model.ConversionType;
import mn.tenplus.Tradingview.model.Stock;
import mn.tenplus.Tradingview.model.currency.Data;
import mn.tenplus.Tradingview.model.currency.ExchangeMarket;
import mn.tenplus.Tradingview.model.currency.Response;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DataService {
    Map<String, ArrayList<String>> pairs = new HashMap<>();
    ExchangeMarket CHKH = new ExchangeMarket(pairs);
    Data Data = new Data(CHKH);

    Response response = new Response(Data);


    public Response getCurrency() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("TNL");
        lst.add("MNT");

        pairs.put("CHKH", lst);
        return response;
    }


    public Stock getHistory() {

        mn.tenplus.Tradingview.model.Data data1 = mn.tenplus.Tradingview.model.Data.builder()
                .time(1463702400)
                .close(439.76)
                .high(443.14)
                .low(435.54)
                .open(436.23)
                .volumefrom(13016.7)
                .volumeto(5731347.42)
                .conversionType("force_direct")
                .conversionSymbol("")
                .build();

        mn.tenplus.Tradingview.model.Data data2 = mn.tenplus.Tradingview.model.Data.builder()
                .time(1463788800)
                .close(440.82)
                .low(435.3)
                .high(442.16)
                .open(442.11)
                .volumefrom(6078.55)
                .volumeto(2671658.98)
                .conversionType("force_direct")
                .conversionSymbol("")
                .build();

        List<mn.tenplus.Tradingview.model.Data> Data = new LinkedList<mn.tenplus.Tradingview.model.Data>();
        Data.add(data1);
        Data.add(data2);


        return Stock.builder()
                .Response("Success")
                .Type(100)
                .Aggregated(false)
                .TimeTo(1637229024)
                .TimeFrom(1609459200)
                .FirstValueInArray(true)
                .conversionType(new ConversionType("force_direct", ""))
                .Data(Data)
                .build();
    }


}
