package com.dubbo.server;


import org.springframework.stereotype.Service;

/**
 * Created by patrick on 2016/4/19.
 */
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello"+name;
    }
}