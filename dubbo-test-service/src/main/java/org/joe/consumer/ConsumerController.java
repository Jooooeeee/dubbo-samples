package org.joe.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.joe.provider.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ConsumerController {

    @DubboReference(
            scope = "remote",
            timeout = 5000 )
    private UserService demoService;


    @GetMapping("/sayHello")
    public String sayHello() {
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
        return result;
    }
}