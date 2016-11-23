package com.d.t.interceptor;

 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SysUserAccessApiInterceptor extends HandlerInterceptorAdapter {
	
//	private final Logger log = LogManager.getLogger(getClass());
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(" SysUserAccessApiInterceptor.preHandle ");
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(" SysUserAccessApiInterceptor.postHandle ");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(" SysUserAccessApiInterceptor.afterCompletion ");
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(" SysUserAccessApiInterceptor.afterConcurrentHandlingStarted ");
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
 
}
