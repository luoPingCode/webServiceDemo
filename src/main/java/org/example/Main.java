package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.example.service.HelloService;
import org.example.service.Impl.HelloServiceImpl;

/**
 * @author LuoPing
 * @project ${PRODUCT_NAME}
 * @Package ${PROJECT_NAME}
 * @Date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        //发布服务工厂
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://localhost:8080/ws/hello");
        //设置服务类
//        jaxWsServerFactoryBean.setServiceClass(HelloService.class);
        jaxWsServerFactoryBean.setServiceBean(new HelloServiceImpl());
//发布服务
        jaxWsServerFactoryBean.create();
        System.out.println("发布成功");
    }}