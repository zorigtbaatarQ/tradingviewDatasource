package mn.tenplus.Tradingview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Stock implements Serializable {
    private String Response;
    private int Type;
    private boolean Aggregated;
    private long TimeTo;
    private long TimeFrom;
    private boolean FirstValueInArray;
    private ConversionType conversionType;
    private List<Data> Data;
}
