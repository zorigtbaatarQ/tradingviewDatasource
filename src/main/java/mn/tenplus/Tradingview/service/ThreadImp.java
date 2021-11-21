package mn.tenplus.Tradingview.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadImp  {



    public void exec() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        executorService.shutdown();
    }
}
