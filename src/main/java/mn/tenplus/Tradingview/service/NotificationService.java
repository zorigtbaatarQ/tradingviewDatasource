package mn.tenplus.Tradingview.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobile){
        sleep(2);
        System.out.println("called 3rd party to send text message");
        System.out.println(10/0);
    }

    private void sleep(int seconds) {
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
