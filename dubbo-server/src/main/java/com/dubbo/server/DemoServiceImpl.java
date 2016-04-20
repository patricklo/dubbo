package com.dubbo.server;

/**
 * Created by patrick on 2016/4/19.
 */
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " + name;
    }

}
