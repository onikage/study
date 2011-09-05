package com.snk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class SysLogInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = -2420984383380815348L;
	
	static Logger logger = LoggerFactory.getLogger("other");

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		invocation.addPreResultListener(
			new PreResultListener(){
				public void beforeResult(ActionInvocation invocation, String resultCode) {
					if(!"success".equals(resultCode)){
						logger.debug("resultCode is :"+resultCode);
					}else{
						logger.debug("resultCode is 'success'");
					}
				}
			});
		return invocation.invoke();
	}
}
