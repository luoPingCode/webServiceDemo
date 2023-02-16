package org.example.service;

import javax.jws.WebService;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package webServiceDemo
 * @Date 2023/2/13 22:30
 * 对外发布服务的接口
 */
@WebService
public interface HelloService {
//    对外发布服务的方法
    public String sayHello(String name);
}
