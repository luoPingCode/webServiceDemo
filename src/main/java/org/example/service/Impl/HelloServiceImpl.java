package org.example.service.Impl;

import org.example.service.HelloService;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package webServiceDemo
 * @Date 2023/2/13 22:31
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name + "Hello WebService JAXWS";
    }
}
