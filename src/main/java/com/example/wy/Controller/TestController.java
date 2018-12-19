package com.example.wy.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.wy.threadPool.ThreadPoolUser;
 
 
@RestController
@RequestMapping(value = "/test")
public class TestController {
 
    @Autowired
    private ThreadPoolUser threadPoolUser;
 
 
    @RequestMapping(value = "/threadpool/test" , method=RequestMethod.GET)
    public String threadPoolTest() {
        threadPoolUser.test();
        return "ok";
    }
 
 
}
