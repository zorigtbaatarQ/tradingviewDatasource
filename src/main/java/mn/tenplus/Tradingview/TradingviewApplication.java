package mn.tenplus.Tradingview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TradingviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradingviewApplication.class, args);
    }

}


