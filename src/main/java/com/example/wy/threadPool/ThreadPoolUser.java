package com.example.wy.threadPool;





import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
 
 

@Slf4j
@Component
public class ThreadPoolUser {

    @Async("testExecutorPool")
    public void test(){
        String info = "test---" + Thread.currentThread().getName();
        log.info(info);
    }

}