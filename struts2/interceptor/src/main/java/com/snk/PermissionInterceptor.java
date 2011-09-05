package com.snk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PermissionInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = 1L;
    
    static Logger logger = LoggerFactory.getLogger("other");

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
    	//action name
        invocation.getProxy().getAction().getClass().getName();
        //method name
        invocation.getProxy().getMethod();
        //session
        //Map<String, Object> session = invocation.getInvocationContext().getSession();
        logger.debug("in PermissionInterceptor.");
        return invocation.invoke();
    }
}
