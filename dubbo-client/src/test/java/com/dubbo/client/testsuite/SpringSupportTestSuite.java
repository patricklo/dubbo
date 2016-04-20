package com.dubbo.client.testsuite;

import org.apache.struts2.StrutsSpringTestCase;

/**
 * Created by patrick on 2015/10/12.
 */
public abstract class SpringSupportTestSuite extends StrutsSpringTestCase {
    @Override
    protected String[] getContextLocations() {
        return new String[]{"classpath*:applicationContext-*.xml"};
    }
}
