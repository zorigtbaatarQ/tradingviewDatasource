package mn.tenplus.Tradingview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private long time;
    private double close;
    private double high;
    private double low;
    private double open;
    private double volumefrom;
    private double volumeto;
    private String conversionType;
    private String conversionSymbol;
}
