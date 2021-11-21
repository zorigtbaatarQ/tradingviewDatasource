package mn.tenplus.Tradingview.model.currency;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.Serializable;

@lombok.Data
@Builder
@AllArgsConstructor
public class Data implements Serializable {

    private ExchangeMarket CHKH;

}
