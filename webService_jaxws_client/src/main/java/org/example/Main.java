package org.example;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.example.service.HelloService;

/**
 * @author LuoPing
 * @project ${PRODUCT_NAME}
 * @Package ${PROJECT_NAME}
 * @Date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(HelloService.class);
        //设置远程访问服务端地址
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/ws/hello");
//        对接口生成代理对象
        HelloService helloService = (HelloService) jaxWsProxyFactoryBean.create();
        System.out.println(helloService.getClass());
        System.out.println(helloService.sayHello("World,"));
    }
}