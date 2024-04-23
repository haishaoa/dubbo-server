package com.haishao.service;

/**
 * @author haishao
 * @time 2024-04-19-19:13
 */
public interface HelloService {
    /**
     * 参数要求是客户端：dubbo-consumer提供的
     *
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * bye
     *
     * @param name
     * @return
     */
    String sayBye(String name);
}
