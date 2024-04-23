package com.haishao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haishao.service.HelloService;

/**
 * @author haishao
 * @time 2024-04-19-19:16
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("HelloServiceImpl.sayHello被调用1次");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "Hello," + name;
    }

    @Override
    public String sayBye(String name) {
        System.out.println("HelloServiceImpl.sayBye被调用1次");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "Bye," + name;
    }
}
