package com.haishao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haishao.service.HelloService;

/**
 * @author haishao
 * @time 2024-04-19-19:16
 */
@Service
public class HelloServiceImpl02 implements HelloService {
    @Override
    public String sayHello(String name) {
//        System.out.println("服务器1：HelloServiceImpl02.sayHello被调用1次");
        System.out.println("服务器2：HelloServiceImpl02.sayHello被调用1次");
//        System.out.println("服务器3：HelloServiceImpl02.sayHello被调用1次");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "Hello," + name;
    }

    @Override
    public String sayBye(String name) {
        System.out.println("HelloServiceImpl02.sayBye被调用1次");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Bye," + name;
    }
}
