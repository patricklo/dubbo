package com.dubbo.client;

import com.dubbo.server.TestRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by patrick on 2016/4/20.
 */

@Controller("indexAction")
@Scope("prototype")
public class IndexController {

    @Autowired
    private TestRegistryService testRegistryService;

    public String index(){
        String name=testRegistryService.hello("zz");
        System.out.println("xx=="+name);
        return "";
    }

}
