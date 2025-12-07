package org.joe.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.joe.provider.UserService;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        System.out.println("name = " + name);
        return "Hello " + name;
    }
}
