package mn.tenplus.Tradingview.controller;

import mn.tenplus.Tradingview.model.Stock;
import mn.tenplus.Tradingview.model.currency.Response;
import mn.tenplus.Tradingview.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("data")
@CrossOrigin(origins = "http://localhost:3000")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("v3/all/exchanges")
    public Response getData(){
        return dataService.getCurrency();
    }

    @GetMapping("histoday")
    public Stock getHistory(@RequestParam long fTs,@RequestParam long toTs){
        System.out.println("from: "+fTs+" to: "+toTs);
        return dataService.getHistory();
    }




}
