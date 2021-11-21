package mn.tenplus.Tradingview.controller;

import mn.tenplus.Tradingview.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class Notfication {

    @Autowired
    private NotificationService notficationService;

    @GetMapping("send")
    public String sendMessage(String mobile){
        notficationService.sendTextMessage(mobile);
        return "message send successfully!!! : "+Thread.currentThread().getName();
    }

    @PostMapping("publish")
    public void putMessages(){

    }


}
