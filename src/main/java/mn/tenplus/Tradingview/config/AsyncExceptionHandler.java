package mn.tenplus.Tradingview.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable ex, Method method, Object... args) {
        System.out.println("Method name" + method.getName() + "---" + "error Message" + ex.getMessage());
    }
}
