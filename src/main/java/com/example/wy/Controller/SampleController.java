package com.example.wy.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @RestController 注解： 该注解是 @Controller 和 @ResponseBody 注解的合体版
 */
@RestController
public class SampleController {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${content}")
	private String content;
	
    @RequestMapping("/")
    String home() {
        return content;
    }
    @RequestMapping("/test")
    String test2() {
        return name+age;
    }
}