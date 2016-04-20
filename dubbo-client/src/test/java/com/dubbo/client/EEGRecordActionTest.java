package com.dubbo.client;

import com.dubbo.client.testsuite.SpringSupportTestSuite;
import com.opensymphony.xwork2.ActionProxy;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patrick on 2015/12/3.
 * Copyright @ EEGSmart
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EEGRecordActionTest extends SpringSupportTestSuite {
    private static final String TEST_URI = "/app/indexAct!";


    public void test1GetEEGHistoryRecord() throws Exception {

        ActionProxy proxy = getActionProxy(TEST_URI+"index.action");
        assertNotNull(proxy);
        IndexController action = (IndexController) proxy.getAction();
        assertNotNull(action);
        Map<String, Object> sessionMap = new HashMap<String, Object>();
        proxy.execute();
    }



}


